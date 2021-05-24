fun main(){
	// In polymorphism parent can hold the refernce for the the child the class exmple
	var circle: Circle = Circle(5.0)
	var circle2: Shape = Circle(5.0)
	if(circle.area()==circle2.area()){
		println("Both produce same code")
	}
	else{
		println("No both are different")
	}
	
	
	// therfore it from above lines output we can states that parent ke can hold refernce for child class.
	
	var shape : Array<Shape> = arrayOf(Circle(5.0),Triangle(3.0,4.0),Sqaure(5.0))
	// From above line code we can see that we defin array of shape but we are able to store the objects of child class.
	
	calculateArea(shape)
	
	
	// Note whereever the parent object is expected there we can pass child object but not true for fisa versa
	// Example;
	
	val obj1 = Shape()
	printArea(obj1)
	
	val obj2 = Circle(6.0)
	printArea(obj2)
	
	// See we can pass child object in a function where shape object is required
	
	val obj3 = Circle(8.0)
	printAreaChild(obj3);

	val obj4 = Shape()
//	printAreaChild(obj4) // This line is showing error therefore we can not pass object of parent where child object required.
	
	
	// Note Parent can Call Methods of child class by its refernce which are common.
	//example

	var obj5 : Shape = Circle(8.9)
	obj5.area()  // this line is coorect
	//obj5.printradius() // this is giving error hence we comment it. therfore our above statement is proved.

	
}

//In polymorphism a function behaves differently for example in this code area() method behaves differently for every different class object.

fun calculateArea(shapes: Array<Shape>){
		for(shape :Shape in shapes){
			println(shape.area())
		}
	}

open class Shape{
	open fun area() = 0.0; 
}


class Circle(val radius:Double):Shape(){
	override fun area() = radius*radius*Math.PI
	fun printradius() = println("radius is $radius")
}


class Triangle(val height:Double,val width:Double):Shape(){
	override fun area() = 0.5*height*width
}

class Sqaure(val side:Double):Shape(){
	override fun area() = side*side
}


fun printArea(shape:Shape){
	println(shape.area())
}

fun printAreaChild(shape:Circle){
	println(shape.area())
}

