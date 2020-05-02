
package com.hcomany.hwallet.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transactionId",
    "accountNumber",
    "amount",
    "type",
    "transactionDate"
})
public class TransactionDetails {

    @JsonProperty("transactionId")
    private String transactionId;
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("targetAccountNumber")
    private String targetAccountNumber;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("type")
    private String type;
    @JsonProperty("transactionDate")
    private String transactionDate;

    @JsonProperty("transactionId")
    public String getTransactionId() {
        return transactionId;
    }

    @JsonProperty("transactionId")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @JsonProperty("accountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    @JsonProperty("accountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getTargetAccountNumber() {
        return targetAccountNumber;
    }

    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setTargetAccountNumber(String targetAccountNumber) {
        this.targetAccountNumber = targetAccountNumber;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("transactionDate")
    public String getTransactionDate() {
        return transactionDate;
    }

    @JsonProperty("transactionDate")
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("transactionId", transactionId).append("accountNumber", accountNumber).append("amount", amount).append("type", type).append("transactionDate", transactionDate).toString();
    }

}
