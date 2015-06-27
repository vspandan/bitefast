/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-03-26 20:30:19 UTC)
 * on 2015-06-27 at 13:46:55 UTC 
 * Modify at your own risk.
 */

package com.spandan.bitefast.gcmbackend.messaging;

/**
 * Service definition for Messaging (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link MessagingRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Messaging extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.20.0 of the messaging library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://expanded-symbol-98518.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "messaging/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Messaging(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Messaging(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the MessagingEndpoint collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Messaging messaging = new Messaging(...);}
   *   {@code Messaging.MessagingEndpoint.List request = messaging.messagingEndpoint().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public MessagingEndpoint messagingEndpoint() {
    return new MessagingEndpoint();
  }

  /**
   * The "messagingEndpoint" collection of methods.
   */
  public class MessagingEndpoint {

    /**
     * Create a request for the method "messagingEndpoint.addUserRecord".
     *
     * This request holds the parameters needed by the messaging server.  After setting any optional
     * parameters, call the {@link AddUserRecord#execute()} method to invoke the remote operation.
     *
     * @param name
     * @param addressLine1
     * @param street
     * @param city
     * @param phoneNum
     * @param country
     * @param password
     * @return the request
     */
    public AddUserRecord addUserRecord(java.lang.String name, java.lang.String addressLine1, java.lang.String street, java.lang.String city, java.lang.String phoneNum, java.lang.String country, java.lang.String password) throws java.io.IOException {
      AddUserRecord result = new AddUserRecord(name, addressLine1, street, city, phoneNum, country, password);
      initialize(result);
      return result;
    }

    public class AddUserRecord extends MessagingRequest<Void> {

      private static final String REST_PATH = "addUserRecord/{name}/{addressLine1}/{street}/{city}/{phoneNum}/{country}/{password}";

      /**
       * Create a request for the method "messagingEndpoint.addUserRecord".
       *
       * This request holds the parameters needed by the the messaging server.  After setting any
       * optional parameters, call the {@link AddUserRecord#execute()} method to invoke the remote
       * operation. <p> {@link AddUserRecord#initialize(com.google.api.client.googleapis.services.Abstra
       * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
       * the constructor. </p>
       *
       * @param name
       * @param addressLine1
       * @param street
       * @param city
       * @param phoneNum
       * @param country
       * @param password
       * @since 1.13
       */
      protected AddUserRecord(java.lang.String name, java.lang.String addressLine1, java.lang.String street, java.lang.String city, java.lang.String phoneNum, java.lang.String country, java.lang.String password) {
        super(Messaging.this, "POST", REST_PATH, null, Void.class);
        this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
        this.addressLine1 = com.google.api.client.util.Preconditions.checkNotNull(addressLine1, "Required parameter addressLine1 must be specified.");
        this.street = com.google.api.client.util.Preconditions.checkNotNull(street, "Required parameter street must be specified.");
        this.city = com.google.api.client.util.Preconditions.checkNotNull(city, "Required parameter city must be specified.");
        this.phoneNum = com.google.api.client.util.Preconditions.checkNotNull(phoneNum, "Required parameter phoneNum must be specified.");
        this.country = com.google.api.client.util.Preconditions.checkNotNull(country, "Required parameter country must be specified.");
        this.password = com.google.api.client.util.Preconditions.checkNotNull(password, "Required parameter password must be specified.");
      }

      @Override
      public AddUserRecord setAlt(java.lang.String alt) {
        return (AddUserRecord) super.setAlt(alt);
      }

      @Override
      public AddUserRecord setFields(java.lang.String fields) {
        return (AddUserRecord) super.setFields(fields);
      }

      @Override
      public AddUserRecord setKey(java.lang.String key) {
        return (AddUserRecord) super.setKey(key);
      }

      @Override
      public AddUserRecord setOauthToken(java.lang.String oauthToken) {
        return (AddUserRecord) super.setOauthToken(oauthToken);
      }

      @Override
      public AddUserRecord setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (AddUserRecord) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public AddUserRecord setQuotaUser(java.lang.String quotaUser) {
        return (AddUserRecord) super.setQuotaUser(quotaUser);
      }

      @Override
      public AddUserRecord setUserIp(java.lang.String userIp) {
        return (AddUserRecord) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.String name;

      /**

       */
      public java.lang.String getName() {
        return name;
      }

      public AddUserRecord setName(java.lang.String name) {
        this.name = name;
        return this;
      }

      @com.google.api.client.util.Key
      private java.lang.String addressLine1;

      /**

       */
      public java.lang.String getAddressLine1() {
        return addressLine1;
      }

      public AddUserRecord setAddressLine1(java.lang.String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
      }

      @com.google.api.client.util.Key
      private java.lang.String street;

      /**

       */
      public java.lang.String getStreet() {
        return street;
      }

      public AddUserRecord setStreet(java.lang.String street) {
        this.street = street;
        return this;
      }

      @com.google.api.client.util.Key
      private java.lang.String city;

      /**

       */
      public java.lang.String getCity() {
        return city;
      }

      public AddUserRecord setCity(java.lang.String city) {
        this.city = city;
        return this;
      }

      @com.google.api.client.util.Key
      private java.lang.String phoneNum;

      /**

       */
      public java.lang.String getPhoneNum() {
        return phoneNum;
      }

      public AddUserRecord setPhoneNum(java.lang.String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
      }

      @com.google.api.client.util.Key
      private java.lang.String country;

      /**

       */
      public java.lang.String getCountry() {
        return country;
      }

      public AddUserRecord setCountry(java.lang.String country) {
        this.country = country;
        return this;
      }

      @com.google.api.client.util.Key
      private java.lang.String password;

      /**

       */
      public java.lang.String getPassword() {
        return password;
      }

      public AddUserRecord setPassword(java.lang.String password) {
        this.password = password;
        return this;
      }

      @Override
      public AddUserRecord set(String parameterName, Object value) {
        return (AddUserRecord) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "messagingEndpoint.findUser".
     *
     * This request holds the parameters needed by the messaging server.  After setting any optional
     * parameters, call the {@link FindUser#execute()} method to invoke the remote operation.
     *
     * @param phoneNum
     * @return the request
     */
    public FindUser findUser(java.lang.String phoneNum) throws java.io.IOException {
      FindUser result = new FindUser(phoneNum);
      initialize(result);
      return result;
    }

    public class FindUser extends MessagingRequest<com.spandan.bitefast.gcmbackend.messaging.model.UserRecord> {

      private static final String REST_PATH = "findUser/{PhoneNum}";

      /**
       * Create a request for the method "messagingEndpoint.findUser".
       *
       * This request holds the parameters needed by the the messaging server.  After setting any
       * optional parameters, call the {@link FindUser#execute()} method to invoke the remote operation.
       * <p> {@link
       * FindUser#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param phoneNum
       * @since 1.13
       */
      protected FindUser(java.lang.String phoneNum) {
        super(Messaging.this, "POST", REST_PATH, null, com.spandan.bitefast.gcmbackend.messaging.model.UserRecord.class);
        this.phoneNum = com.google.api.client.util.Preconditions.checkNotNull(phoneNum, "Required parameter phoneNum must be specified.");
      }

      @Override
      public FindUser setAlt(java.lang.String alt) {
        return (FindUser) super.setAlt(alt);
      }

      @Override
      public FindUser setFields(java.lang.String fields) {
        return (FindUser) super.setFields(fields);
      }

      @Override
      public FindUser setKey(java.lang.String key) {
        return (FindUser) super.setKey(key);
      }

      @Override
      public FindUser setOauthToken(java.lang.String oauthToken) {
        return (FindUser) super.setOauthToken(oauthToken);
      }

      @Override
      public FindUser setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (FindUser) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public FindUser setQuotaUser(java.lang.String quotaUser) {
        return (FindUser) super.setQuotaUser(quotaUser);
      }

      @Override
      public FindUser setUserIp(java.lang.String userIp) {
        return (FindUser) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key("PhoneNum")
      private java.lang.String phoneNum;

      /**

       */
      public java.lang.String getPhoneNum() {
        return phoneNum;
      }

      public FindUser setPhoneNum(java.lang.String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
      }

      @Override
      public FindUser set(String parameterName, Object value) {
        return (FindUser) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "messagingEndpoint.sendMessage".
     *
     * This request holds the parameters needed by the messaging server.  After setting any optional
     * parameters, call the {@link SendMessage#execute()} method to invoke the remote operation.
     *
     * @param message
     * @param redId
     * @return the request
     */
    public SendMessage sendMessage(java.lang.String message, java.lang.String redId) throws java.io.IOException {
      SendMessage result = new SendMessage(message, redId);
      initialize(result);
      return result;
    }

    public class SendMessage extends MessagingRequest<Void> {

      private static final String REST_PATH = "sendMessage/{message}/{redId}";

      /**
       * Create a request for the method "messagingEndpoint.sendMessage".
       *
       * This request holds the parameters needed by the the messaging server.  After setting any
       * optional parameters, call the {@link SendMessage#execute()} method to invoke the remote
       * operation. <p> {@link
       * SendMessage#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param message
       * @param redId
       * @since 1.13
       */
      protected SendMessage(java.lang.String message, java.lang.String redId) {
        super(Messaging.this, "POST", REST_PATH, null, Void.class);
        this.message = com.google.api.client.util.Preconditions.checkNotNull(message, "Required parameter message must be specified.");
        this.redId = com.google.api.client.util.Preconditions.checkNotNull(redId, "Required parameter redId must be specified.");
      }

      @Override
      public SendMessage setAlt(java.lang.String alt) {
        return (SendMessage) super.setAlt(alt);
      }

      @Override
      public SendMessage setFields(java.lang.String fields) {
        return (SendMessage) super.setFields(fields);
      }

      @Override
      public SendMessage setKey(java.lang.String key) {
        return (SendMessage) super.setKey(key);
      }

      @Override
      public SendMessage setOauthToken(java.lang.String oauthToken) {
        return (SendMessage) super.setOauthToken(oauthToken);
      }

      @Override
      public SendMessage setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (SendMessage) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public SendMessage setQuotaUser(java.lang.String quotaUser) {
        return (SendMessage) super.setQuotaUser(quotaUser);
      }

      @Override
      public SendMessage setUserIp(java.lang.String userIp) {
        return (SendMessage) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.String message;

      /**

       */
      public java.lang.String getMessage() {
        return message;
      }

      public SendMessage setMessage(java.lang.String message) {
        this.message = message;
        return this;
      }

      @com.google.api.client.util.Key
      private java.lang.String redId;

      /**

       */
      public java.lang.String getRedId() {
        return redId;
      }

      public SendMessage setRedId(java.lang.String redId) {
        this.redId = redId;
        return this;
      }

      @Override
      public SendMessage set(String parameterName, Object value) {
        return (SendMessage) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "messagingEndpoint.verifiedUser".
     *
     * This request holds the parameters needed by the messaging server.  After setting any optional
     * parameters, call the {@link VerifiedUser#execute()} method to invoke the remote operation.
     *
     * @param phoneNum
     * @return the request
     */
    public VerifiedUser verifiedUser(java.lang.String phoneNum) throws java.io.IOException {
      VerifiedUser result = new VerifiedUser(phoneNum);
      initialize(result);
      return result;
    }

    public class VerifiedUser extends MessagingRequest<com.spandan.bitefast.gcmbackend.messaging.model.UserRecord> {

      private static final String REST_PATH = "verifiedUser/{PhoneNum}";

      /**
       * Create a request for the method "messagingEndpoint.verifiedUser".
       *
       * This request holds the parameters needed by the the messaging server.  After setting any
       * optional parameters, call the {@link VerifiedUser#execute()} method to invoke the remote
       * operation. <p> {@link
       * VerifiedUser#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param phoneNum
       * @since 1.13
       */
      protected VerifiedUser(java.lang.String phoneNum) {
        super(Messaging.this, "POST", REST_PATH, null, com.spandan.bitefast.gcmbackend.messaging.model.UserRecord.class);
        this.phoneNum = com.google.api.client.util.Preconditions.checkNotNull(phoneNum, "Required parameter phoneNum must be specified.");
      }

      @Override
      public VerifiedUser setAlt(java.lang.String alt) {
        return (VerifiedUser) super.setAlt(alt);
      }

      @Override
      public VerifiedUser setFields(java.lang.String fields) {
        return (VerifiedUser) super.setFields(fields);
      }

      @Override
      public VerifiedUser setKey(java.lang.String key) {
        return (VerifiedUser) super.setKey(key);
      }

      @Override
      public VerifiedUser setOauthToken(java.lang.String oauthToken) {
        return (VerifiedUser) super.setOauthToken(oauthToken);
      }

      @Override
      public VerifiedUser setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (VerifiedUser) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public VerifiedUser setQuotaUser(java.lang.String quotaUser) {
        return (VerifiedUser) super.setQuotaUser(quotaUser);
      }

      @Override
      public VerifiedUser setUserIp(java.lang.String userIp) {
        return (VerifiedUser) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key("PhoneNum")
      private java.lang.String phoneNum;

      /**

       */
      public java.lang.String getPhoneNum() {
        return phoneNum;
      }

      public VerifiedUser setPhoneNum(java.lang.String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
      }

      @Override
      public VerifiedUser set(String parameterName, Object value) {
        return (VerifiedUser) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Messaging}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Messaging}. */
    @Override
    public Messaging build() {
      return new Messaging(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link MessagingRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setMessagingRequestInitializer(
        MessagingRequestInitializer messagingRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(messagingRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
