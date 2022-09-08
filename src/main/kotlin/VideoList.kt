import react.*
import kotlinx.browser.window
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.div

    val unwatchedVideos = listOf(
        Video(1,"Opening Keynote","Adrey Breslav","https://youtu.be/PsaFVLr8t4E"),
        Video(2,"Dissecting the stdlib","Huyen Tue Dao","https://youtu.be/Fzt_9I733Yg"),
        Video(3,"Kotlin and Spring Boot","Nicolas Frankel","https://youtu.be/pSiZVAeReeg")
    )
    val watchedVideos = listOf(
        Video(4,"Creating Internal DSLs in Kotlin","Venkat Subramaniam","https://youtu.be/JzTeAM8N1-o")
    )
external interface VideoListProps : Props {
    var videos: List<Video>
    var selectedVideo: Video?
    var onSelectVideo: (Video) -> Unit

}
    val VideoList = FC<VideoListProps> { props ->
div{
    className = ""
        for (video in props.videos) {
            var videoId = "${video.videoUrl}".drop(32)
            var videocode = videoId.drop(32)
            print(videoId)
            console.log(videocode)
            p {
                key = video.id.toString()

                onClick = {
                    props.onSelectVideo(video)
                }
                div {
                    className = "images-line"
                if (video == props.selectedVideo){
                    +"▶ "
                }


                    img {
                        src = "http://img.youtube.com/vi/${videoId}/1.jpg"
                    }
                    p{
                    +"${video.speaker}: ${video.title}"
                    }
                }
            }

        }
}
    }

