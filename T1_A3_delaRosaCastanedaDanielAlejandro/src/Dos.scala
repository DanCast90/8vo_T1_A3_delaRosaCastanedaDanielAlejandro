import scala.io.StdIn._

object Dos {
  
  def divisores(num: Int, i: Int): Unit={
      if(i>0){
       if(num%i==0){
        printf("%d es un divisor de:  %d \n",i,num)
      }
      divisores(num, i-1)
  }
  }
  
  
  
  def main(args: Array[String]): Unit={
    
    println("============DOS:  DIVISORES===============")
    println("Ingresa un numero: ")
    var num=readInt()
    divisores(num, num)
  }
}