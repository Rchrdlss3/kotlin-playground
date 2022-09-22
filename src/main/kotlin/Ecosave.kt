import react.*
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.button

val Ecosave = FC<Props>{
    div{
        className = "Ecosave-wrapper"
        div {
            className = "main-wrapper"
            img {
                src = "https://raw.githubusercontent.com/Rchrdlss3/blob/main/battery2.png"
            }
            h1 {
                +"Accelerate Energy Efficiency & Cost Savings Throughout Your Property Portfolio   "
            }

        }
        div{
            className="information-wrapper"
            div{
                className="info-card"
                img{
                    src="https://images.squarespace-cdn.com/content/v1/620a5301726e974ebb22054c/1657288061104-PDPM41NCEKJYS4OGBY0P/energy-services.png?format=100w"
                }
                p{
                    +"Comprehensive Energy Services"
                }
                button{
                    +"Learn More"
                }
            }

            div{
                className="info-card"
                img{
                    src="https://images.squarespace-cdn.com/content/v1/620a5301726e974ebb22054c/1657288115786-7OXZI2BR6Z845T139KTD/no-cost-08.png?format=100w"
                }
                p{
                    +"No Upfront Costs"
                }
                button{
                    +"Learn More"
                }
            }

            div {
                className = "info-card"
                img{
                    src="https://images.squarespace-cdn.com/content/v1/620a5301726e974ebb22054c/1657286939751-W8Y55ZQ642WFF62GS7MS/smart-buildings.png?format=100w"
                }
                p {
                    +"Smart Building Controls"
                }
                button{
                    +"Learn More"
                }
            }

            div {
                className = "info-card"
                img {
                    src = "https://images.squarespace-cdn.com/content/v1/620a5301726e974ebb22054c/1657287882641-D0057096TB6F4UHPNA3R/software-08-08.png?format=100w"
                }
                p {
                    +"Energy Management Software"
                }
                button{
                    +"Learn More"
                }
            }
        }

    }


}