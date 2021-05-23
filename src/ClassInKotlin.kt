fun main(){
	
	// Here we created object of our class
	
	println("Student Class Output")
	
	var s1 = Student("Sher",48,12)
	s1.study()
	s1.play() // By the help of dot operator we can call the class methods
	
	println()
	
	println("Calculator class")
	
	var calc = calculator()   // In calculator class we don't assign any constructor but kotlin will construct a default constructor.
	var result = calc.add(5,8)
	println("The output of mthod add from class calculator is $result")
	
	println()
	
	
	println("AutoMobile ")
	var c1 = AutoMobile("Car","Petrol")  // This line will call the second constructor of the class
	c1.drive()
	// Notice in the above line line while creating the object pour our class we passed only two argument therefore it calls
	// secondary constructor but from where primary constructor is getting the remaing properties of our class
	// Basically that properties this given by secondary constructor which we provide them as default by hard coding these values.
	
	println()
	
	
	var c2  = AutoMobile("Bike",2,3,"Diesel")
	c2.drive()
	// c2 is calling the primary constructor to initialise its properties.
	
	
	
	println()
	println("Person class")
	var p1 = Person("Sher",20)
	println(p1.name) // calling the getter
	
	p1.age = 45 
	p1.age = -10   // calling the setter
	
	
	
	
	
}

// Default constructor

class calculator{
	fun add(a:Int,b:Int):Int{
		return a+b
	}
}



// This is a simple class named as student and having primary constructor.
class Student(var name:String, val rollno:Int , var standard:Int){
	
	fun study(){
		println("$name is currentrly studying")
	}
	fun play(){
		println("$name is playing")
	}
	
}


// Secondar constructor

class AutoMobile(val name:String, val tyres:Int, var maxSeating:Int, var engine:String){
	init{
		// This is an initialiser block we used this if we want to execute some kinds of operation on creating the object of our class
		println("The object of the class is created")
	}
	
	
	fun drive(){
		println("The $name is running on $tyres wheel and having maxcapacity of $maxSeating people")
	}
	
	constructor(name:String,engine:String):
		this(name,4,5,engine)   // this keyword helps in calling the primary constructor of our class Auromobile
	
	
}





// Getter and setter

class Person(name:String,age:Int){
	var name :String = name //Itialising property
	get(){
		return field
		// This filed keyword is a special keyword which holds the value
	}
	
	var age: Int = age
	set(value){
		if(value>0){
			field = value
			println("$value assigned to filed")
		}
		else{
			println("This is a wrong input")
		}
	}
	
	// If we don't assign any getter and setter than kotlin will automaticaly assign it;
}





