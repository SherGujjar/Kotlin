fun main(){
	
	val m1 = RealMe()  // we created the object of real me class
	m1.makeCall()  // we are able to call the method present inside the Mobile class by the help of Inheritence
	
	m1.display()   
	println(m1.name)
	println(m1.size)
	m1.capturePhoto()
	
	
	
	var a1 = Mi("MI",true)
	a1.display();
	a1.capturePhoto();
	a1.isAndroid()
	
	
}

// Kotlin did not support multiple class inheritance

// we need to assign open keyword int front of calss which will be inherited by other classes in future
open class Mobile(){
	open val name:String=""
	open val size:Int=5
	fun makeCall() = println("Calling")
	fun powerOff() = println("Turn Off")
	fun powerOn() = println("Turn on")
	open fun display() = println("Default Display")
}


// class RealMe is inheriting the mobile class
class RealMe:Mobile(){
	override val name = "RealMe"  // we use keyword override to override any function or property of parent calss
	override val size = 6
	override fun display() = println("$name Display")  // this will override the display method present in the moblie class
	fun capturePhoto() = println("RealMe have camera")
	
	
	// To override anything the attribute of that method or properties must be open
}

open class Androids(name:String,isAndroid:Boolean){  // This is parametrized constructor of our Android
	open val name:String= name
	val isAndroid = isAndroid
	open val size:Int=5
	fun makeCall() = println("Calling")
	fun powerOff() = println("Turn Off")
	fun powerOn() = println("Turn on")
	open fun display() = println("Default Display")
}



class Mi(name:String,isAndroid:Boolean):Androids(name,isAndroid){   // This will call parametizes constructor of our Androids class
	override val name =name  
	override val size = 6
	override fun display(){
		super.display()  // By the help of super keyword we can call the function display that is present in the parent calss.
		println("$name Display") 
	}
	fun isAndroid(){
		if(isAndroid){
			println("Yes it is Android Phone")
		}
		else{
			println("No its not")
		}
	}
	fun capturePhoto() = println("$name have camera")
	
	
}










