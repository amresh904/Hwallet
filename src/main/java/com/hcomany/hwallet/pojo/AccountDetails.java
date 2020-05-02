
package com.hcomany.hwallet.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "userGUID",
    "accountNumber",
    "Balance",
    "openingDate",
    "closingDate",
    "status"
})
public class AccountDetails {

    @JsonProperty("userGUID")
    private String userGUID;
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("Balance")
    private Double balance;
    @JsonProperty("openingDate")
    private String openingDate;
    @JsonProperty("closingDate")
    private String closingDate;
    @JsonProperty("status")
    private String status;

    @JsonProperty("userGUID")
    public String getUserGUID() {
        return userGUID;
    }

    @JsonProperty("userGUID")
    public void setUserGUID(String userGUID) {
        this.userGUID = userGUID;
    }

    @JsonProperty("accountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    @JsonProperty("accountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @JsonProperty("Balance")
    public Double getBalance() {
        return balance;
    }

    @JsonProperty("Balance")
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @JsonProperty("openingDate")
    public String getOpeningDate() {
        return openingDate;
    }

    @JsonProperty("openingDate")
    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }

    @JsonProperty("closingDate")
    public String getClosingDate() {
        return closingDate;
    }

    @JsonProperty("closingDate")
    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("userGUID", userGUID).append("accountNumber", accountNumber).append("balance", balance).append("openingDate", openingDate).append("closingDate", closingDate).append("status", status).toString();
    }

}
