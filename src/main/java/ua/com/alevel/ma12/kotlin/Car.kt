package ua.com.alevel.ma12.kotlin

class Car {

    var wheels:Int = 4;
    var windows:Int = 6;
    var speed:Int = 0;
    var price:Double = 0.0;
    var name:String = "";
    var mark:String = "";

    constructor(speed: Int, price: Double, name: String, mark: String) {
        this.speed = speed
        this.price = price
        this.name = name
        this.mark = mark
    }

    override fun toString(): String {
        return "Car(wheels=$wheels, windows=$windows, speed=$speed, price=$price, name='$name', mark='$mark')"
    }


}
