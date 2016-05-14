/**
  * Created by syd on 2016. 5. 14..
  */
object main {

  def main(args: Array[String]) {

    var capital = Map("US" -> "Washinton",
      "France"->"Paris")
    capital +=("Korea"->"Seoul")


    println(capital("France"))
    println(capital("Korea"))
  }
}
