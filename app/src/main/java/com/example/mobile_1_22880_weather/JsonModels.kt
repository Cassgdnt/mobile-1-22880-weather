package com.example.mobile_1_22880_weather

     class CityWeather
    (
            val name: String,
            val weather: List<Weather>,
            val main: Temperature,
            val sys: Country
    )
     class Weather(
            val main: String,
            val description: String
    )
     class Temperature(
            val temp: Float
    )
     class Country(
            val country: String
    )



class WeatherJson(val list: List<CityWeather>)