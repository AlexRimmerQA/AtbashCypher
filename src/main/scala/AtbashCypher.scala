/*
  Created by Alex Rimmer @ QAConsulting
 */

class AtbashCypher {
  def letterAdjust(input: Char): Char = {
    if(input.isLower) {
      ('z' - (input - 'a')).toChar
    }
    else {
      ('Z' - (input - 'A')).toChar
    }
  }

  def toCypher(input: String): String = {
   input.map(x =>
     if(x.isLetter) {
       letterAdjust(x);
     } else {
       x
     }).toString
  }
}
