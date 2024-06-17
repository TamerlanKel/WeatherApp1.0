package com.example.weatherapp10

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import java.net.URL
import java.text.DecimalFormat
import org.json.JSONObject
import javax.net.ssl.HttpsURLConnection

class MainActivity : AppCompatActivity() {

    private val cityName = "Санкт-Петербург" // Необязательно, т.к. название города уже есть в разметке
    private val latitude = 59.89
    private val longitude = 30.26
    private val apiKey = "2f3c1bad2f3c1bad2f3c1bad2f3c1bad" // Замените на ваш API ключ OpenWeatherMap
    private val units = "metric" // metric or imperial
    private val language = "ru" // ru or en

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        refreshButton.setOnClickListener {
            updateData()
        }

        updateData()
    }

    private fun updateData() {
        val urlString = "https://api.openweathermap.org/data/2.5/weather?lat=$latitude&lon=$longitude&units=$units&appid=$apiKey&lang=$language"
        val url = URL(urlString)
        val connection = url.openConnection() as HttpsURLConnection

        try {
            connection.request

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WeatherApp10Theme {
        Greeting("Android")
    }
}