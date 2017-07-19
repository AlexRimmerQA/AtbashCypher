/*
  Created by Alex Rimmer @ QAConsulting
 */

import org.scalatest.{FlatSpec, Matchers}

class TestBase extends FlatSpec with Matchers {
  val cypher = new AtbashCypher
}
