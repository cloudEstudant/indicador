
package com.model.bmundial;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "indicator",
    "country",
    "countryiso3code",
    "date",
    "value",
    "unit",
    "obs_status",
    "decimal"
})
public class IndicadorPobreza {

    @JsonProperty("indicator")
    private Indicator indicator;
    @JsonProperty("country")
    private Country country;
    @JsonProperty("countryiso3code")
    private String countryiso3code;
    @JsonProperty("date")
    private String date;
    @JsonProperty("value")
    private Object value;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("obs_status")
    private String obsStatus;
    @JsonProperty("decimal")
    private Integer decimal;

    @JsonProperty("indicator")
    public Indicator getIndicator() {
        return indicator;
    }

    @JsonProperty("indicator")
    public void setIndicator(Indicator indicator) {
        this.indicator = indicator;
    }

    @JsonProperty("country")
    public Country getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(Country country) {
        this.country = country;
    }

    @JsonProperty("countryiso3code")
    public String getCountryiso3code() {
        return countryiso3code;
    }

    @JsonProperty("countryiso3code")
    public void setCountryiso3code(String countryiso3code) {
        this.countryiso3code = countryiso3code;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("value")
    public Object getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Object value) {
        this.value = value;
    }

    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @JsonProperty("obs_status")
    public String getObsStatus() {
        return obsStatus;
    }

    @JsonProperty("obs_status")
    public void setObsStatus(String obsStatus) {
        this.obsStatus = obsStatus;
    }

    @JsonProperty("decimal")
    public Integer getDecimal() {
        return decimal;
    }

    @JsonProperty("decimal")
    public void setDecimal(Integer decimal) {
        this.decimal = decimal;
    }

}
