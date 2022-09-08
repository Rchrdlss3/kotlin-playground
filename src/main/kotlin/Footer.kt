import react.*
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img
val Footer = FC<Props>{
   div{
       className="Footer-wrapper"
       img{
           src="https://images.squarespace-cdn.com/content/v1/620a5301726e974ebb22054c/9ee89a6c-0eeb-4405-8652-6485f826f687/ES2021_AU_Reverse_YNP_transparent_All-White_small-tagline.png?format=1500w"
       }
       div{
           className="copyright"
           +"© 2022 Ecosave"
       }
       +" Privacy Policy | Terms and Conditions"
   }
}