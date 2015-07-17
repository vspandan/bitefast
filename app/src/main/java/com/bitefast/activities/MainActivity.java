package com.bitefast.activities;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.Settings;
import android.support.multidex.MultiDex;

import com.bitefast.R;
import com.bitefast.services.GcmDataSavingAsyncTask;
import com.bitefast.services.HeartBeatService;
import com.bitefast.util.CheckInternetConnectivity;
import com.bitefast.util.Config;
import com.bitefast.util.RegistrationDetails;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.spandan.bitefast.gcmbackend.messaging.Messaging;
import com.spandan.bitefast.gcmbackend.messaging.model.User;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MainActivity extends Activity {
    private static final int SPLASH_SHOW_TIME = 1000;
    private CheckInternetConnectivity cd = null;
    private GoogleCloudMessaging gcm;
    private AsyncTask<Void, Void, String> sendTask;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        startService(new Intent(getBaseContext(), HeartBeatService.class));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (!isTaskRoot()) {
            final Intent intent = getIntent();
            final String intentAction = intent.getAction();
            if (intent.hasCategory(Intent.CATEGORY_LAUNCHER) && intentAction != null && intentAction.equals(Intent.ACTION_MAIN)) {
                finish();
                return;
            }
        }
        cd = new CheckInternetConnectivity(getApplicationContext());
        if (cd.isConnectingToInternet()) {
            new AppRegister().execute();
        } else {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setMessage("No Network Connectivity");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    System.exit(0);
                }
            });
            alertDialog.show();
        }

    }

    @Override
    protected void attachBaseContext(Context newBase) {
        MultiDex.install(newBase);
        super.attachBaseContext(newBase);
    }

    @Override
    protected void onPause() {

        super.onPause();
    }

    private class AppRegister extends AsyncTask<Void, Void, Void> {
        String msg = "";
        String regId = "";
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            new BackgroundSplashTask().execute();
        }

        @Override
        protected Void doInBackground(Void... params) {
            try {
                if (gcm == null) {
                    gcm = GoogleCloudMessaging.getInstance(getApplicationContext());
                }

                regId = gcm.register(Config.GOOGLE_SENDER_ID);
                msg = "Device registered, registration ID=" + regId;
                new RegistrationDetails().storeRegistrationId(getApplicationContext(), regId);
            } catch (IOException ex) {
                ex.printStackTrace();
                msg = "Error: " + ex.getMessage();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
                super.onPostExecute(result);
                if (regId.isEmpty()){
                    Logger.getLogger("REGISTRATION").log(Level.INFO, msg);
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setMessage("Check Your Internet Connectivity");
                    alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            System.exit(0);
                        }
                    });
                    alertDialog.show();
                }
                else
                {
                    Intent i = null;
                    if (new RegistrationDetails().isLoggedIn(getApplicationContext())) {
                        Logger.getLogger("MainActivity").log(Level.INFO, "sign up");
                        final boolean values[] = new boolean[1];
                        try {

                            final String phoneNum = new RegistrationDetails().getPhoneNum(getApplicationContext());
                            Thread t = new Thread(new Runnable() {
                                public void run() {
                                    Messaging msgService = null;
                                    if (msgService == null) {
                                        Messaging.Builder builder = new Messaging.Builder(AndroidHttp.newCompatibleTransport(),
                                                new AndroidJsonFactory(), null);
                                        builder.setApplicationName("BiteFast");
                                        msgService = builder.build();
                                    }
                                    User usr = new User();
                                    try {
                                        usr = msgService.isAdmin(phoneNum).execute();
                                        values[0] = usr.getAdmin();
                                    } catch (Exception ex) {
                                        System.exit(1);
                                        ex.printStackTrace();
                                    }
                            /*Logger.getLogger("LaunchActivity").log(Level.INFO, phoneNum + ":" + usr.toString());*/
                                }
                            });
                            t.start();
                            t.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        Logger.getLogger("LaunchActivity").log(Level.INFO, "Retrieved User: " + values[0]);
                        if (values[0]) {
                            new RegistrationDetails().setAdmin(getApplicationContext());
                            i = new Intent(MainActivity.this, UserListActivity.class);
                        } else {
                            //Updating registration details and
                            String androidId = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);
                            new GcmDataSavingAsyncTask().updateUserRegid(androidId, new RegistrationDetails().getRegistrationId(getApplicationContext()), new RegistrationDetails().getPhoneNum(getApplicationContext()));
                            i = new Intent(MainActivity.this, ChatActivity.class);
                            i.putExtra("SENDTO", "BITEFAST_ADMIN");
                        }
                    } else {
                        i = new Intent(MainActivity.this, BitefastSignUp.class);
                        Logger.getLogger("MainActivity").log(Level.INFO, "registering");
                    }
                    startActivity(i);
                }
            }
    }

    private class BackgroundSplashTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                Thread.sleep(SPLASH_SHOW_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }


        @Override
        protected void onPostExecute(Void result) {super.onPostExecute(result);}

    }

}
