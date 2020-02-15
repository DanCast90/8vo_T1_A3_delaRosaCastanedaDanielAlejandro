import scala.io.StdIn._

object Seis {
  
  def binario(n:Int): Unit={
    if (n < 2) {
			print(n);
			} else {
			binario(n / 2);
			print(n % 2);
			}
  }
   def main(args: Array[String]): Unit ={
      println("============SEIS:  BINARIO===============")
    println("Ingresa numerO: ")
    var n=readInt()
    binario(n)
   }
}