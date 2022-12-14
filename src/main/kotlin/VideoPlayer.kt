import csstype.*
import react.*
import react.css.css
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h3


external interface VideoPlayerProps : Props {
    var video: Video
    var onWatchedButtonPressed: (Video) -> Unit
    var unwatchedVideo: Boolean
}
val VideoPlayer = FC<VideoPlayerProps>{ props ->
    div{
        className  = "VideoPlayerProps"


        div {
            className = "video-wrapper"
            ReactPlayer {
                url = props.video.videoUrl
            }
        }
        div {
            h3 {
                +"${props.video.speaker}: ${props.video.title}"
            }
        }

        button{
            css{
                display = Display.block
                backgroundColor = if (props.unwatchedVideo)  rgba(255,70,114,1.0) else rgb(159,83,255)

                textAlign = TextAlign.center

            }
            onClick = {
                props.onWatchedButtonPressed(props.video)
            }
            if (props.unwatchedVideo){
                +"Mark as watched"
            } else {
                +"Mark as unwatched"
            }
        }
        div {
            EmailShareButton {

                url = props.video.videoUrl
                EmailIcon {
                    size = 32
                    round = true
                }
            }
            TelegramShareButton {
                url = props.video.videoUrl
                TelegramIcon {
                    size = 32
                    round = true
                }
            }
        }
    }
}