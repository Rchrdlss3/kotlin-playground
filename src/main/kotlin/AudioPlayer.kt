import react.*
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.audio
import react.dom.html.ReactHTML.source


external interface AudioPlayerProps : Props {

}
val AudioPlayer = FC<Props>{
    div{
        audio{
            controls = true
            source{
                src = "http://listen.vo.llnwd.net/g3/prvw/6/5/3/8/2/2603428356.mp3"
            }
        }
    }
}