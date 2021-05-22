/*Conditional expression includes if else and when*/


fun main(){
	var a = 20
	var b = 60
	if(a>b){
		println("A is greater than B")
	}
	else{
		println("B is Graeter  than A")
	}
	
	
	// If else can also be used as an expression
	
	val c = if(a>b) a else b
	
	println("The value of c is $c")
	
	// Now Let us understand the concept of when
	// Basically it a kinf of switch statement in terms of c language
	
	
	var x = 'a'
	when(x){
		'a' -> print("A")
		'b' ->print("B")
		'c' ->print("C")
		else->{
			println("Other alphabet ")
		}
		
	}
	
}