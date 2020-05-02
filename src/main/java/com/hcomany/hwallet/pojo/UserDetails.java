
package com.hcomany.hwallet.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "emailId",
    "firstName",
    "lastName",
    "Address",
    "accNumber",
    "govID",
    "password",
    "AuthTYpe"
})
public class UserDetails {

    @JsonProperty("id")
    private String id;
    @JsonProperty("emailId")
    private String emailId;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("Address")
    private Address address;
    @JsonProperty("accNumber")
    private String accNumber;
    @JsonProperty("govID")
    private String govID;
    @JsonProperty("password")
    private String password;
    @JsonProperty("AuthTYpe")
    private String authTYpe;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("emailId")
    public String getEmailId() {
        return emailId;
    }

    @JsonProperty("emailId")
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("Address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("Address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("accNumber")
    public String getAccNumber() {
        return accNumber;
    }

    @JsonProperty("accNumber")
    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    @JsonProperty("govID")
    public String getGovID() {
        return govID;
    }

    @JsonProperty("govID")
    public void setGovID(String govID) {
        this.govID = govID;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    @JsonProperty("AuthTYpe")
    public String getAuthTYpe() {
        return authTYpe;
    }

    @JsonProperty("AuthTYpe")
    public void setAuthTYpe(String authTYpe) {
        this.authTYpe = authTYpe;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("emailId", emailId).append("firstName", firstName).append("lastName", lastName).append("address", address).append("accNumber", accNumber).append("govID", govID).append("password", password).append("authTYpe", authTYpe).toString();
    }

}
