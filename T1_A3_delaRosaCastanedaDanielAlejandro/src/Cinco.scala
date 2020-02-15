import scala.io.StdIn._

object Cinco {
  var i: Int = 0
  def numCocientes(n: Int,n2: Int, cont: Int): Int={
   
    if(n2!=0){
		 if(n%n2==0){
		 
			numCocientes((n/n2), n2,0)
		  }  
		}
		else{
			println("no se puede dividir entre 0")
		}
		cont
  }
  
    def main(args: Array[String]): Unit ={
      println("============CINCO:  NUMERO COCIENTES===============")
    println("Ingresa numero 1: ")
    var n=readInt()
     println("Ingresa numero 2: ")
    var n2=readInt()
   println( numCocientes(n, n2,0))
    
    }
}