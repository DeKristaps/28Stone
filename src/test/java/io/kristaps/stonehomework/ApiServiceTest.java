package io.kristaps.stonehomework;

import io.kristaps.stonehomework.dto.Country;
import io.kristaps.stonehomework.dto.PublicHoliday;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
class ApiServiceTest {

    @Spy
    apiService apiService = new apiService();
    TestObjects testObjects = new TestObjects();

    @Test
    void getPublicHolidays() {
        String year = "2017";
        String countryCode = "LV";
        List<PublicHoliday> expected = Arrays.asList(testObjects.holidaysInLV);

        List<PublicHoliday> actual = this.apiService.getPublicHolidays(year, countryCode);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void getNeighboringCountries() {
        String countryCode = "LV";
        List<Country> expected = List.of(testObjects.neighboringCountries);

        List<Country> actual = this.apiService.getNeighboringCountries(countryCode);

        Assertions.assertEquals(expected, actual);

    }
}