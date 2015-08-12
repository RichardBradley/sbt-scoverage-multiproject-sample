package myproject

import org.scalatest.{FreeSpec, Matchers}

class AppTest extends FreeSpec with Matchers {

  "App" - {
    "should have a covered method" in {
      new App().covered shouldBe "covered"
    }
  }
}

