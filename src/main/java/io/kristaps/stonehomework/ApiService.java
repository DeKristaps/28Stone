package io.kristaps.stonehomework;

import io.kristaps.stonehomework.dto.AvailableCountries;
import io.kristaps.stonehomework.dto.Country;
import io.kristaps.stonehomework.dto.PublicHoliday;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.web.reactive.function.client.WebClient.create;

@Service
public class ApiService {
    private final String url = "https://date.nager.at/api/v3/";

    public List<PublicHoliday> getPublicHolidays(String year, String countryCode) {
        String localUrl = url + "publicholidays/" + year + "/" + countryCode;

        return getPublicHolidays(localUrl);
    }

    public List<Country> getNeighboringCountries(String countryCode) {
        String localUrl = url + "CountryInfo/" + countryCode;

        Country country = create(localUrl)
                .get().retrieve()
                .onStatus(HttpStatusCode::is4xxClientError, clientResponse -> {
                    throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Country not available");
                })
                .bodyToMono(Country.class)
                .block();

        if (country == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Country not available");
        }

        return List.of(country.getBorders());
    }

    public List<AvailableCountries> getAvailableCountries() {
        String localUrl = url + "AvailableCountries";

        AvailableCountries[] availableCountries = create(localUrl)
                .get().retrieve()
                .onStatus(HttpStatusCode::is5xxServerError, response -> {
                    throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, "Service unavailable");
                })
                .bodyToMono(AvailableCountries[].class)
                .block();

        if (availableCountries == null) {
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, "Service unavailable");
        }

        return List.of(availableCountries);
    }

    public List<PublicHoliday> getNextPublicHolidays() {
        String localUrl = url + "NextPublicHolidaysWorldwide";

        return getPublicHolidays(localUrl);
    }

    private List<PublicHoliday> getPublicHolidays(String localUrl) {
        PublicHoliday[] publicHolidays = create(localUrl)
                .get().retrieve()
                .onStatus(HttpStatusCode::is4xxClientError, clientResponse -> {
                    throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Country not available");
                })
                .bodyToMono(PublicHoliday[].class)
                .block();

        if (publicHolidays == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Country not available");
        }

        return List.of(publicHolidays);
    }
}
