/*
  Created by Alex Rimmer @ QAConsulting
 */

class AtbashCypher {
 def toCypher(input: String): String = {
   input.map(x =>
     if(x >= 'a' && x <= 'z') {
       ('z' - (x - 'a')).toChar
     } else if(x >= 'A' && x <= 'Z') {
       ('Z' - (x - 'A')).toChar
     } else {
       x
     }).toString
 }
}
