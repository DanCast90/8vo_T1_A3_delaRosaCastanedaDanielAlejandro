import scala.io.StdIn._

object Tres {
  def factorial (num: Long): Long={
    if (num==0)
     1
    else
     num * factorial(num-1);
  }
  
  def main(args: Array[String]): Unit ={
    println("============TRES:  FACTORIAL===============")
    println("Ingresa un numero: ")
    var num=readLong()
    println(factorial(num))
  }
}