package io.kristaps.stonehomework.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class PublicHoliday implements Serializable {

    LocalDate date;
    String localName;
    String name;
    String countryCode;
    boolean fixed;
    boolean global;
    String[] counties;
    Integer launchYear;
    String[] types;

    public PublicHoliday(LocalDate date, String localName, String name, String countryCode, boolean fixed, boolean global, String[] counties, Integer launchYear, String[] types) {
        this.date = date;
        this.localName = localName;
        this.name = name;
        this.countryCode = countryCode;
        this.fixed = fixed;
        this.global = global;
        this.counties = counties;
        this.launchYear = launchYear;
        this.types = types;
    }

    public PublicHoliday() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public boolean isFixed() {
        return fixed;
    }

    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }

    public boolean isGlobal() {
        return global;
    }

    public void setGlobal(boolean global) {
        this.global = global;
    }

    public String[] getCounties() {
        return counties;
    }

    public void setCounties(String[] counties) {
        this.counties = counties;
    }

    public Integer getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(Integer launchYear) {
        this.launchYear = launchYear;
    }

    public String[] getTypes() {
        return types;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PublicHoliday holiday = (PublicHoliday) o;
        return fixed == holiday.fixed && global == holiday.global && Objects.equals(launchYear, holiday.launchYear) && date.equals(holiday.date) && localName.equals(holiday.localName) && name.equals(holiday.name) && countryCode.equals(holiday.countryCode) && Arrays.equals(counties, holiday.counties) && Arrays.equals(types, holiday.types);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(date, localName, name, countryCode, fixed, global, launchYear);
        result = 31 * result + Arrays.hashCode(counties);
        result = 31 * result + Arrays.hashCode(types);
        return result;
    }

    @Override
    public String toString() {
        return "PublicHoliday{" +
                "date=" + date +
                ", localName='" + localName + '\'' +
                ", name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", fixed=" + fixed +
                ", global=" + global +
                ", counties=" + Arrays.toString(counties) +
                ", launchYear=" + launchYear +
                ", types=" + Arrays.toString(types) +
                '}';
    }
}
