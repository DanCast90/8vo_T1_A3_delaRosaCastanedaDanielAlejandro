import scala.io.StdIn._

object Siete {
  
 def vocales(palabra: String ,numero : Int, numeroBase : Int): Int={
    if(numeroBase==palabra.length()){
      numero
    }else{
      if((palabra.substring(numeroBase, numeroBase+1)).equalsIgnoreCase("a")||
          (palabra.substring(numeroBase, numeroBase+1)).equalsIgnoreCase("e")||
          (palabra.substring(numeroBase, numeroBase+1)).equalsIgnoreCase("i")||
          (palabra.substring(numeroBase, numeroBase+1)).equalsIgnoreCase("o")||
          (palabra.substring(numeroBase, numeroBase+1)).equalsIgnoreCase("u")){
        vocales(palabra, numero+1, numeroBase+1)
      }
      else{
        vocales(palabra, numero, numeroBase+1)
      }
    }
	
  }
  
   def main(args: Array[String]): Unit ={
   println("============SIETE:  VOCALES===============")
     var nom=readLine("Ingresa una cadena: ")
    print(vocales(nom, 0, 0))
   }
}