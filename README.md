<h1>Rest API Example.</h1>

<p>This is a API that consumes data from <a href="https://date.nager.at/">https://date.nager.at/</a></p> 

<p> the application runs on <a href="http://localhost:8080">http://localhost:8080</a> and gives us options to:</p>

* Request Public Holidays for given country in certain years.
* Request Neighboring countries for given Country.
* Request all available counties for witch you can request aforementioned data.
* Request the next 7 upcoming public holidays worldwide.

All the listed methods are Get methods that can be tested with Postman. 
## Requesting Public Holidays

<p>Call:  http://localhost:8080/{year}/{countryCoe}</p>
Example: <a href="http://localhost:8080/2017/LV">http://localhost:8080/2017/LV </a>

## Request Neighboring countries

<p>Call:  http://localhost:8080/{countryCoe}</p>
Example: <a href="http://localhost:8080/LV">http://localhost:8080/LV </a>

## Request all available counties

Example: <a href="http://localhost:8080/availableCountries">http://localhost:8080/availableCountries </a>

## Request the next 7 upcoming public holidays
Example: <a href="http://localhost:8080/NextPublicHolidays">http://localhost:8080/NextPublicHolidays </a>