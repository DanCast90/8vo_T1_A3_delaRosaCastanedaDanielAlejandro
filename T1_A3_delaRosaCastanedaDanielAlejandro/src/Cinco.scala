import scala.io.StdIn._

object Cinco {
  def division(num1:Int, num2:Int): Int={
    if(num2>num1){
      0
    }else{
      1+division(num1-num2, num2)
    }
  }
  
    def main(args: Array[String]): Unit ={
      println("============CINCO:  NUMERO COCIENTES===============")
    println("Ingresa numero 1: ")
    var n=readInt()
     println("Ingresa numero 2: ")
    var n2=readInt()
   println( division(n, n2))
    
    }
}