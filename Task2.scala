object Main extends App{
  
  def factorial(num: Int): Long = {
    //base case
    if(num <= 1){
      1
    }
    //tail recursion
    else{
      num * factorial(num-1)
    }
  }
  //Testing the function
  println("Factorial of 12 is : " + factorial(12))
}
