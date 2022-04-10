package com.anabstract

fun main(){
val coffeeMachine = PremiumCoffee ( 10000.0,  "BROWN")
val info = coffeeMachine.machineInfo()
val coffee = coffeeMachine.makeCoffee ( "CAPPUCCINO")
println (coffee)
println(info)
}