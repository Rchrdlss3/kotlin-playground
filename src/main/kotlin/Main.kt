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

fun main() {

    val container = document.getElementById("root") ?: error("Couldn't find root container!")
    //require("style.css")
   render(App.create(),container)

}

