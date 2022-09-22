@file:JsModule("chart.js")
@file:JsNonModule
import react.*
import kotlinx.serialization.Serializable


@JsName("Bar")
external val Bar:ComponentClass<BarProps>



external interface BarProps: Props{

}