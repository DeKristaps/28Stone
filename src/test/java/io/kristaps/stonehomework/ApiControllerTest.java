package io.kristaps.stonehomework;

import io.kristaps.stonehomework.dto.AvailableCountries;
import io.kristaps.stonehomework.dto.Country;
import io.kristaps.stonehomework.dto.PublicHoliday;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.BDDMockito.when;


@ExtendWith(MockitoExtension.class)
class ApiControllerTest {

    @Mock
    ApiService apiService;

    @InjectMocks
    ApiController apiController;

    TestObjects testObjects = new TestObjects();

    @Test
    void getPublicHolidays() {
        String year = "2017";
        String country = "LV";

        List<PublicHoliday> expected = List.of(testObjects.lvHoliday);

        when(apiService.getPublicHolidays(year, country)).thenReturn(List.of(testObjects.lvHoliday));

        List<PublicHoliday> actual = apiController.getPublicHolidays(year, country);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getNeighboringCountries() {
        String country = "LV";

        List<Country> expected = List.of(testObjects.neighboringCountries);

        when(apiService.getNeighboringCountries(country)).thenReturn(List.of(testObjects.neighboringCountries));
        List<Country> actual = apiController.getNeighboringCountries(country);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void getAvailableCountries() {
        List<AvailableCountries> expected = List.of(new AvailableCountries("LV", "Latvia"));

        when(apiService.getAvailableCountries()).thenReturn(List.of(new AvailableCountries("LV", "Latvia")));
        List<AvailableCountries> actual = apiController.getAvailableCountries();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void getNextPublicHolidays() {
        List<PublicHoliday> expected = List.of(testObjects.lvHoliday);

        when(apiService.getNextPublicHolidays()).thenReturn(List.of(testObjects.lvHoliday));

        List<PublicHoliday> actual = apiController.getNextPublicHolidays();

        Assertions.assertEquals(expected, actual);
    }
}