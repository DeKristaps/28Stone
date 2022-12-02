package io.kristaps.stonehomework.dto;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;


public class Country implements Serializable {

    String commonName;
    String officialName;
    String countryCode;
    String region;
    Country[] borders;

    public Country() {
    }

    public Country(String commonName, String officialName, String countryCode, String region, Country[] borders) {
        this.commonName = commonName;
        this.officialName = officialName;
        this.countryCode = countryCode;
        this.region = region;
        this.borders = borders;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Country[] getBorders() {
        return borders;
    }

    public void setBorders(Country[] borders) {
        this.borders = borders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return commonName.equals(country.commonName) && officialName.equals(country.officialName) && countryCode.equals(country.countryCode) && region.equals(country.region) && Arrays.equals(borders, country.borders);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(commonName, officialName, countryCode, region);
        result = 31 * result + Arrays.hashCode(borders);
        return result;
    }

    @Override
    public String toString() {
        return "Country{" +
                "commonName='" + commonName + '\'' +
                ", officialName='" + officialName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", region='" + region + '\'' +
                ", borders=" + Arrays.toString(borders) +
                '}';
    }
}
