/*
  Created by Alex Rimmer @ QAConsulting
 */

class AtbashCypher {
 def toCypher(input: String): String = {
   input.map(x =>
     if(x.isLetter) {
       if(x.isLower) {
         ('z' - (x - 'a')).toChar
       } else {
         ('Z' - (x - 'A')).toChar
       }
     } else {
       x
     }
   ).toString
 }
}
