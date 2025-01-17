package com.bitefast.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.bitefast.beans.UserListBean;
import com.bitefast.sqlite.MySQLiteHelper2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by rubbernecker on 7/7/15.
 */
public class UserDataSource {
    // Database fields
    private SQLiteDatabase database;
    private MySQLiteHelper2 dbHelper;
    private String[] allColumns = { MySQLiteHelper2.COLUMN_ID,
            MySQLiteHelper2.COLUMN_NAME,MySQLiteHelper2.COLUMN_READ, MySQLiteHelper2.COLUMN_TIMESTAMP, MySQLiteHelper2.COLUMN_REGPHN};

    public UserDataSource(Context context) {
        dbHelper = new MySQLiteHelper2(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public boolean createUserListEntry(UserListBean deviceUserBean) {
        ContentValues values = new ContentValues();
        values.put(MySQLiteHelper2.COLUMN_NAME, deviceUserBean.name);
        values.put(MySQLiteHelper2.COLUMN_READ, deviceUserBean.read);
        values.put(MySQLiteHelper2.COLUMN_TIMESTAMP, deviceUserBean.timestamp);
        values.put(MySQLiteHelper2.COLUMN_REGPHN, deviceUserBean.regPhn);
        long id=database.insert(MySQLiteHelper2.TABLE_USER, null,
                values);
        Cursor cursor = database.query(MySQLiteHelper2.TABLE_USER,
                allColumns, MySQLiteHelper2.COLUMN_ID + " = " + id, null,
                null, null, null);
        cursor.moveToFirst();
        deviceUserBean = cursorToComment(cursor);
        cursor.close();
        return deviceUserBean != null;
    }

    public boolean deleteEntry(String name) {
        long id=database.delete(MySQLiteHelper2.TABLE_USER, MySQLiteHelper2.COLUMN_NAME + " = " + name,
                null);
        return id > 0;
    }

    public boolean updateUserListEntry(String name, String readStat) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(MySQLiteHelper2.COLUMN_READ,readStat);
        long id=database.update(MySQLiteHelper2.TABLE_USER, contentValues, MySQLiteHelper2.COLUMN_NAME + " = " + name,
                null);
        return id > 0;
    }

    public List<UserListBean> getAllEntries(String phn) {
        List<UserListBean> userList = new ArrayList<UserListBean>();

        Cursor cursor = database.query(MySQLiteHelper2.TABLE_USER,
                allColumns, MySQLiteHelper2.COLUMN_REGPHN + " = \'" + phn + "\'", null, null, null, null);



        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            UserListBean deviceUserBean = cursorToComment(cursor);
            userList.add(deviceUserBean);
            cursor.moveToNext();
        }
        // make sure to close the cursor
        cursor.close();
        return userList;
    }

    public Set<UserListBean> getSortedEntries(String phn){
        return new TreeSet<UserListBean>(getAllEntries(phn));
    }

    public List<UserListBean> getSortedEntriesList(String phn){
        List<UserListBean> beanList= new ArrayList<UserListBean>();
        Set<UserListBean> beans= getSortedEntries(phn);
        Iterator<UserListBean> itr=beans.iterator();
        boolean left=false;
        while(itr.hasNext()){
            beanList.add(itr.next());
        }
        return beanList;
    }

    private UserListBean cursorToComment(Cursor cursor) {
        UserListBean deviceUserBean = new UserListBean(cursor.getLong(0),cursor.getString(1),cursor.getString(2),cursor.getLong(3),cursor.getString(4));
        return deviceUserBean;
    }
}
