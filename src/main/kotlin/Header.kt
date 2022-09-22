import react.*
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.nav

val Header = FC<Props>{
    div{
        className = "header-wrapper"
        div {
            className = "company-logo"
            img {
                src =
                    "https://images.squarespace-cdn.com/content/v1/620a5301726e974ebb22054c/9ee89a6c-0eeb-4405-8652-6485f826f687/ES2021_AU_Reverse_YNP_transparent_All-White_small-tagline.png?format=1500w"
            }
        }
        nav{
            NavLink{
                to = "/"
                +"Home"
            }
            NavLink{
                to = "/Weather"
                +"Weather Info"
            }
            NavLink{
                to = "https://ecosaveinc.com/turnkey-solutions"
                +"Turkney Solutions"
            }
        }
        img{
            src="https://raw.githubusercontent.com/Rchrdlss3/blob/main/twitter-xxl.png"
        }
        img {
            src = "https://raw.githubusercontent.com/Rchrdlss3/blob/main/linkedin-xxl.png"
        }
    }


}