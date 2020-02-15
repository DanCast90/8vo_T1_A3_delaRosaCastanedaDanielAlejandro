import scala.io.StdIn._

object Siete {
  
  def vocales(x:String, i:Int,voc:Int): Long={
    if(x.length()>i){
		if(x.substring(i, i+1).equals("a")||x.substring(i, i+1).equals("e")||x.substring(i, i+1).equals("i")||x.substring(i, i+1).equals("o")||x.substring(i, i+1).equals("u")){
			
			vocales(x, i+1,voc+1)
		  }
		}
		 voc
	
  }
  
   def main(args: Array[String]): Unit ={
   println("============SIETE:  VOCALES===============")
     var nom=readLine("Ingresa una cadena: ")
   println( vocales(nom, 0, 0))
   }
}