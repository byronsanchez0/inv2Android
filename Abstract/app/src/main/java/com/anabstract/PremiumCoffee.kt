package com.anabstract

 class PremiumCoffee (
    price: Double, color:String
        ):CoffeeMachine(price,color){

    override val brand: String
        get() = "Brand X"
    override fun makeCoffee(type: String): String {
    return "Your $type is ready ☕"
    }


}