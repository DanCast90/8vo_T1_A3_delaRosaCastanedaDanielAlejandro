import scala.io.StdIn._

object Cuatro {
  
  def cocientes(n: Int,n2: Int): Unit={
    if(n%n2==0){
			if(n2!=1){
			println(n+"/"+n2+"="+(n/n2));
			cocientes((n/n2), n2);
			}
			else{
				println("elige otro numero porfavor");
			}
		}
  }
  
  def main(args: Array[String]): Unit ={
    
    println("============CUATRO:  COCIENTES===============")
    println("Ingresa numero 1: ")
    var n=readInt()
     println("Ingresa numero 2: ")
    var n2=readInt()
    cocientes(n, n2)
  }
}