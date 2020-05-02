
package com.hcomany.hwallet.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "firstLine",
    "secondLIne",
    "city",
    "State",
    "zipCode"
})
public class Address {

    @JsonProperty("firstLine")
    private String firstLine;
    @JsonProperty("secondLIne")
    private String secondLIne;
    @JsonProperty("city")
    private String city;
    @JsonProperty("State")
    private String state;
    @JsonProperty("zipCode")
    private Long zipCode;

    @JsonProperty("firstLine")
    public String getFirstLine() {
        return firstLine;
    }

    @JsonProperty("firstLine")
    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    @JsonProperty("secondLIne")
    public String getSecondLIne() {
        return secondLIne;
    }

    @JsonProperty("secondLIne")
    public void setSecondLIne(String secondLIne) {
        this.secondLIne = secondLIne;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("State")
    public String getState() {
        return state;
    }

    @JsonProperty("State")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("zipCode")
    public Long getZipCode() {
        return zipCode;
    }

    @JsonProperty("zipCode")
    public void setZipCode(Long zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("firstLine", firstLine).append("secondLIne", secondLIne).append("city", city).append("state", state).append("zipCode", zipCode).toString();
    }

}
