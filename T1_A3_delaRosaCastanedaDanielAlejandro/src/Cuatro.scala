import scala.io.StdIn._

object Cuatro {
  
 def cociente(num1:Int, num2:Int): Int ={
    if(num1>=num2){
      cociente(num1-num2, num2)
    }else{
      num1
    }
  }
  
  def main(args: Array[String]): Unit ={
    
    println("============CUATRO:  COCIENTES===============")
    println("Ingresa numero 1: ")
    var n=readInt()
     println("Ingresa numero 2: ")
    var n2=readInt()
    print(cociente(n, n2))
  }
}