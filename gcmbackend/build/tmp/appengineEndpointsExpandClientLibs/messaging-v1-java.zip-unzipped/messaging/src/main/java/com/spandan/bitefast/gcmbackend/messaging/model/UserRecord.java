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

package com.spandan.bitefast.gcmbackend.messaging.model;

/**
 * Model definition for UserRecord.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the messaging. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UserRecord extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String addressLine1;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String city;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String country;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String opt;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String password;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phoneNum;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String street;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean verified;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAddressLine1() {
    return addressLine1;
  }

  /**
   * @param addressLine1 addressLine1 or {@code null} for none
   */
  public UserRecord setAddressLine1(java.lang.String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCity() {
    return city;
  }

  /**
   * @param city city or {@code null} for none
   */
  public UserRecord setCity(java.lang.String city) {
    this.city = city;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCountry() {
    return country;
  }

  /**
   * @param country country or {@code null} for none
   */
  public UserRecord setCountry(java.lang.String country) {
    this.country = country;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public UserRecord setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOpt() {
    return opt;
  }

  /**
   * @param opt opt or {@code null} for none
   */
  public UserRecord setOpt(java.lang.String opt) {
    this.opt = opt;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPassword() {
    return password;
  }

  /**
   * @param password password or {@code null} for none
   */
  public UserRecord setPassword(java.lang.String password) {
    this.password = password;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoneNum() {
    return phoneNum;
  }

  /**
   * @param phoneNum phoneNum or {@code null} for none
   */
  public UserRecord setPhoneNum(java.lang.String phoneNum) {
    this.phoneNum = phoneNum;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStreet() {
    return street;
  }

  /**
   * @param street street or {@code null} for none
   */
  public UserRecord setStreet(java.lang.String street) {
    this.street = street;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVerified() {
    return verified;
  }

  /**
   * @param verified verified or {@code null} for none
   */
  public UserRecord setVerified(java.lang.Boolean verified) {
    this.verified = verified;
    return this;
  }

  @Override
  public UserRecord set(String fieldName, Object value) {
    return (UserRecord) super.set(fieldName, value);
  }

  @Override
  public UserRecord clone() {
    return (UserRecord) super.clone();
  }

}
