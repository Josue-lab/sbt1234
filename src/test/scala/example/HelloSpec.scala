package example

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The hello object" should "say hello" in {
    Hello.greeting shouldEqual "hello"
  }
}