/*
  Created by Alex Rimmer @ QAConsulting
 */

class AtbashTest extends TestBase {
  "The Atbash Cypher of the alphabet" should "return a reversed alphabet" in {
    cypher.toCypher("abcdefghijklmnopqrstuvwxyz") shouldBe "zyxwvutsrqponmlkjihgfedcba"
  }
  "The Atbash Cypher of 'the quick brown fox jumps over the lazy dog'" should "return a cyphered version" in {
    cypher.toCypher("the quick brown fox jumps over the lazy dog") shouldBe "gsv jfrxp yildm ulc qfnkh levi gsv ozab wlt"
  }
  "The Atbash Cypher of '123456789'" should "not change the input" in {
    cypher.toCypher("123456789") shouldBe "123456789"
  }
  "The Atbash Cypher" should "be unaffected by non-letter characters" in {
    cypher.toCypher("What's Up! Hi? said the monkey, swinging from the tree. I'm 5 today! I got $12 and a #1 Badge!") shouldBe
      "Dszg'h Fk! Sr? hzrw gsv nlmpvb, hdrmtrmt uiln gsv givv. R'n 5 glwzb! R tlg $12 zmw z #1 Yzwtv!"
  }
}
