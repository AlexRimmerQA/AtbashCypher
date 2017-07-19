/*
  Created by Alex Rimmer @ QAConsulting
 */

class AtbashCypher {
  def letterAdjust(input: Char): Char = {
    input match {
      case letter if letter.isLower => ('z' - (letter - 'a')).toChar
      case letter if letter.isUpper => ('Z' - (letter - 'A')).toChar
      case _ => input
    }
  }

  def toCypher(input: String): String = {
   input.map(x => letterAdjust(x))
  }
}
