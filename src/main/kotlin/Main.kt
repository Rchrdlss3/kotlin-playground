
import kotlinx.browser.document
import react.*
import react.dom.render
import kotlinext.js.require
import kotlinx.serialization.Serializable



@Serializable
data class Video(
    val id: Int,
    val title: String,
    val speaker: String,
    val videoUrl: String
)
/*
class WeatherRes{
    var main: Main= Main()
}

class Main{
    var temp: Int = 0
    var minTemp: Int =0
    var maxTemp: Int = 0
}
data class Chart(
    var datasets: List<DataObj>
)
class DataObj{
    var label: String = "My First Dataset"
    val data: dataArray
}*
val dataArray = arrayOf(65,59,80,81,56,55,40)
*/

fun main() {

    val container = document.getElementById("root") ?: error("Couldn't find root container!")
    //require("style.css")
    render(App.create(),container)

}
