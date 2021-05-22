/*There are loops in the kotlin for interations
 Mainly there three kinds of loop
 1-> for loop
 2-> while loop
 3-> do while loop
 */

fun main(){
	
	// use of for loop using range
	for(x in 1..10){
		print("$x ")
	}
	// The above code will print counting from 1 to 10
	
	// we can also use for loop to iterate over collections
	
	println()
	 
	val items = listOf("Bat","Ball","Gloves","Helmet","ThighPads")
	
	for(i in items){
		print("$i ")
	}
	
	
	
	// while loop
	var x = 1
	while(x<5){
		println("the current value of x is $x")
		x++;
	}
	
	
	// do while loop
	// this loop is used when we want the first iteration to happen what ever the condition is found
	
	x = 1
	do{
		x++;
		println("The curreent value of x is $x")

	}while(x<1)
	
	
}


