
import scala.io.StdIn._
object Uno {
  
   def cuentaProgresivaRecursivaMejorada(num: Int,num1: Int): Int ={
    if(num>num1){
     0
    }else{
      num1 +cuentaProgresivaRecursivaMejorada(num,num1-1)
     
    }
  }
   
    def main(args: Array[String]): Unit={
      
    println("============UNO:  SUMATORIA CON LIMITES===============")
      println("ingresa limite inicial")
       var num= readInt()
      println("ingresa limite final")
       var num1= readInt()
      printf("La suma desde %d hasta %d es: %d ",num,num1,cuentaProgresivaRecursivaMejorada(num, num1))
    }
}