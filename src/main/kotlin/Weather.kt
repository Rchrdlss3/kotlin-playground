import kotlinx.browser.window
import kotlinx.coroutines.async
import kotlinx.coroutines.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import react.*
import react.dom.*
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.input
import csstype.*
import react.css.css
import react.dom.html.ReactHTML.script
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.table
import react.dom.html.ReactHTML.tr
import react.dom.html.ReactHTML.th
import react.dom.html.ReactHTML.td
import react.dom.html.ReactHTML.thead
import react.dom.html.ReactHTML.tbody
import react.dom.html.ReactHTML.style

/*
suspend fun fetchWeather(id:Int):WeatherRes{
    val response = window
        .fetch("")
        .await()
        .text()
        .await()
    return Json.decodeFromString(response)
}

suspend fun fetchWeatherRes():List<WeatherRes> = coroutineScope{
    (1..7).map{
        id -> async{
            fetchWeather(id)
    }
    }.awaitAll()
}

useEffectOnce{
    mainScope.launch{
        weatherdata = fetchWeatherRes()
    }
}

*/
val Weather = FC<Props>{
    div {
        className= "Weather-wrapper"
        script {
            src = "https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.4/Chart.js"
        }
        h1 {
            +"This is the Weather Page"
        }
    }
}