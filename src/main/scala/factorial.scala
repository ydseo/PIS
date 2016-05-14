/**
  * Created by syd on 2016. 5. 14..
  */
object factorial {

  def main(args: Array[String]) {
    var a = factorial(30)
    print(a)
  }

  def factorial(x:BigInt):BigInt = if(x == 0) 1 else x* factorial(x-1)
}
