import react.*
import react.dom.html.ReactHTML.div


val App = FC<Props> {
    BrowserRouter {
    div {
        className = "App"
        Header()
        Routes{
                Route{
                    path ="/"
                    element = createElement(Home)
                }
            Route{
                path = "/Weather"
                element = createElement(Weather)
            }

        }


    }
}
}
