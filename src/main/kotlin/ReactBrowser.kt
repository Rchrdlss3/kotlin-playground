@file:JsModule("react-router-dom")
@file:JsNonModule
import react.*

@JsName("BrowserRouter")
external val BrowserRouter: ComponentClass<Props>


@JsName("Route")
external val Route:ComponentClass<RouteProps>

@JsName("Switch")
external val Switch:ComponentClass<SwitchProps>

@JsName("Routes")
external val Routes:ComponentClass<RoutesProps>

@JsName("NavLink")
external val NavLink:ComponentClass<NavLinkProps>

external interface NavLinkProps: Props{
    var to: String
}

external interface RoutesProps: Props{

}
external interface RouteProps : Props {
    var path: String
    var element: react.ReactNode?
    var index: Boolean
}
external interface SwitchProps : Props {

}