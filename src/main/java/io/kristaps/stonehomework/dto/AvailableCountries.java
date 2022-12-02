package io.kristaps.stonehomework.dto;

import java.io.Serializable;
import java.util.Objects;

public class AvailableCountries implements Serializable {
    String countryCode;
    String name;

    public AvailableCountries() {
    }

    public AvailableCountries(String countryCode, String name) {
        this.countryCode = countryCode;
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AvailableCountries that = (AvailableCountries) o;
        return countryCode.equals(that.countryCode) && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryCode, name);
    }

    @Override
    public String toString() {
        return "AvailableCountries{" +
                "countryCode='" + countryCode + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
