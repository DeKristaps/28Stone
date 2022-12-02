package io.kristaps.stonehomework;

import io.kristaps.stonehomework.dto.Country;
import io.kristaps.stonehomework.dto.PublicHoliday;

import java.time.LocalDate;

public class TestObjects {
    PublicHoliday[] holidaysInLV = new PublicHoliday[]{
            new PublicHoliday(
                    LocalDate.of(2017, 1, 1),
                    "Jaunais Gads",
                    "New Year's Day",
                    "LV",
                    true,
                    true,
                    null,
                    null,
                    new String[]{"Public"}
            ),
            new PublicHoliday(
                    LocalDate.of(2017, 4, 14),
                    "Lielā Piektdiena",
                    "Good Friday",
                    "LV",
                    false,
                    true,
                    null,
                    null,
                    new String[]{"Public"}
            ),
            new PublicHoliday(
                    LocalDate.of(2017, 4, 16),
                    "Lieldienas",
                    "Easter Sunday",
                    "LV",
                    false,
                    true,
                    null,
                    null,
                    new String[]{"Public"}
            ),
            new PublicHoliday(
                    LocalDate.of(2017, 4, 17),
                    "Otrās Lieldienas",
                    "Easter Monday",
                    "LV",
                    false,
                    true,
                    null,
                    null,
                    new String[]{"Public"}
            ),
            new PublicHoliday(
                    LocalDate.of(2017, 5, 1),
                    "Darba svētki",
                    "Labour Day",
                    "LV",
                    true,
                    true,
                    null,
                    null,
                    new String[]{"Public"}
            ),

            new PublicHoliday(
                    LocalDate.of(2017, 5, 4),
                    "Latvijas Republikas Neatkarības atjaunošanas diena",
                    "Restoration of Independence day",
                    "LV",
                    true,
                    true,
                    null,
                    null,
                    new String[]{"Public"}
            ),

            new PublicHoliday(
                    LocalDate.of(2017, 5, 14),
                    "Mātes diena",
                    "Mother's day",
                    "LV",
                    false,
                    true,
                    null,
                    null,
                    new String[]{"Public"}
            ),
            new PublicHoliday(
                    LocalDate.of(2017, 6, 23),
                    "Līgo Diena",
                    "Midsummer Eve",
                    "LV",
                    true,
                    true,
                    null,
                    null,
                    new String[]{"Public"}
            ),
            new PublicHoliday(
                    LocalDate.of(2017, 6, 24),
                    "Jāņi",
                    "Midsummer Day",
                    "LV",
                    true,
                    true,
                    null,
                    null,
                    new String[]{"Public"}
            ),
            new PublicHoliday(
                    LocalDate.of(2017, 11, 18),
                    "Latvijas Republikas proklamēšanas diena",
                    "Proclamation Day of the Republic of Latvia",
                    "LV",
                    true,
                    true,
                    null,
                    null,
                    new String[]{"Public"}
            ),
            new PublicHoliday(
                    LocalDate.of(2017, 12, 24),
                    "Ziemassvētku vakars",
                    "Christmas Eve",
                    "LV",
                    true,
                    true,
                    null,
                    null,
                    new String[]{"Public"}
            ),
            new PublicHoliday(
                    LocalDate.of(2017, 12, 25),
                    "Ziemassvētki",
                    "Christmas Day",
                    "LV",
                    true,
                    true,
                    null,
                    null,
                    new String[]{"Public"}
            ),
            new PublicHoliday(
                    LocalDate.of(2017, 12, 26),
                    "Otrie Ziemassvētki",
                    "St. Stephen's Day",
                    "LV",
                    true,
                    true,
                    null,
                    null,
                    new String[]{"Public"}
            ),
            new PublicHoliday(
                    LocalDate.of(2017, 12, 31),
                    "Vecgada vakars",
                    "New Year's Eve",
                    "LV",
                    true,
                    true,
                    null,
                    null,
                    new String[]{"Public"}
            )
    };

    Country[] neighboringCountries = new Country[]{
            new Country(
                    "Belarus",
                    "Republic of Belarus",
                    "BY",
                    "Europe",
                    null
            ),
            new Country(
                    "Estonia",
                    "Republic of Estonia",
                    "EE",
                    "Europe",
                    null
            ),
            new Country(
                    "Lithuania",
                    "Republic of Lithuania",
                    "LT",
                    "Europe",
                    null
            ),
            new Country(
                    "Russia",
                    "Russian Federation",
                    "RU",
                    "Europe",
                    null
            )

    };

    PublicHoliday lvHoliday = new PublicHoliday(
            LocalDate.of(2017, 1, 1),
            "Jaunais Gads",
            "New Year's Day",
            "LV",
            true,
            true,
            null,
            null,
            new String[]{"Public"}
    );

}
