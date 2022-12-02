package io.kristaps.stonehomework;

import io.kristaps.stonehomework.dto.AvailableCountries;
import io.kristaps.stonehomework.dto.Country;
import io.kristaps.stonehomework.dto.PublicHoliday;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class apiController {
    private final apiService service;

    public apiController(apiService service) {
        this.service = service;
    }

    @GetMapping("/{year}/{countryCode}")
    public List<PublicHoliday> getPublicHolidays(@PathVariable String year, @PathVariable String countryCode) {

        return this.service.getPublicHolidays(year, countryCode);
    }

    @GetMapping("/{countryCode}")
    public List<Country> getNeighboringCountries(@PathVariable String countryCode) {
        return this.service.getNeighboringCountries(countryCode);
    }

    @GetMapping("/availableCountries")
    public List<AvailableCountries> getAvailableCountries() {
        return this.service.getAvailableCountries();
    }

    @GetMapping("/NextPublicHolidays")
    public List<PublicHoliday> getNextPublicHolidays() {
        return this.service.getNextPublicHolidays();
    }
}
