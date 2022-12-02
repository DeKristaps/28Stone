package io.kristaps.stonehomework;

import io.kristaps.stonehomework.dto.AvailableCountries;
import io.kristaps.stonehomework.dto.Country;
import io.kristaps.stonehomework.dto.PublicHoliday;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Objects;

@Service
public class apiService {
    WebClient builder = WebClient.builder().build();
    private final String url = "https://date.nager.at/api/v3/";

    public List<PublicHoliday> getPublicHolidays(String year, String countryCode) {
        String localUrl = url + "publicholidays/" + year + "/" + countryCode;

        return List.of(Objects.requireNonNull(builder
                .get()
                .uri(localUrl)
                .retrieve()
                .bodyToMono(PublicHoliday[].class)
                .block()));
    }

    public List<Country> getNeighboringCountries(String countryCode) {
        String localUrl = url + "CountryInfo/" + countryCode;

        Country countries = builder
                .get()
                .uri(localUrl)
                .retrieve()
                .bodyToMono(Country.class)
                .block();

        assert countries != null;
        return List.of(countries.getBorders());
    }

    public List<AvailableCountries> getAvailableCountries() {
        String localUrl = url + "AvailableCountries";

        return List.of(Objects.requireNonNull(builder
                .get()
                .uri(localUrl)
                .retrieve()
                .bodyToMono(AvailableCountries[].class)
                .block()));
    }

    public List<PublicHoliday> getNextPublicHolidays() {
        String localUrl = url + "NextPublicHolidaysWorldwide";

        return List.of(Objects.requireNonNull(builder
                .get()
                .uri(localUrl)
                .retrieve()
                .bodyToMono(PublicHoliday[].class)
                .block()));
    }

}
