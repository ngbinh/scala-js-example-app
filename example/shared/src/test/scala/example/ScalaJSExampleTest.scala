package example

import org.scalatest._

abstract class UnitSpec extends FreeSpec with Matchers with OptionValues with Inside with Inspectors

final class ScalaJSExampleTest extends UnitSpec {

  import ScalaJSExample._

  "group one" - {
    "one 1" in {
      square(0) shouldBe 0
    }
  }

  "group two" - {
    "two 1" in {
      square(0) shouldBe 0
    }
    "two 2" in {
      square(1) shouldBe 1
    }
  }
}

final class ScalaJSExampleTest2 extends UnitSpec {

  import ScalaJSExample._

  "group three" - {
    "three 1" in {
      square(0) shouldBe 0
    }
  }

  "group four" - {
    "four 1" in {
      square(0) shouldBe 0
    }
    "four 2" in {
      square(1) shouldBe 1
    }
  }
}

final class ScalaJSExampleTest3 extends UnitSpec {

  import ScalaJSExample._

  "group five" - {
    "five 1" in {
      square(0) shouldBe 2
    }
  }

  "group six" - {
    "six 1" in {
      square(0) shouldBe 0
    }
    "six 2" in {
      square(1) shouldBe 1
    }
  }
}

final class ScalaJSExampleTest4 extends UnitSpec {

  import ScalaJSExample._

  "group seven" - {
    "seven 1" in {
      square(0) shouldBe 0
    }
  }

  "group eight" - {
    "eight 1" in {
      square(0) shouldBe 0
    }
    "eight 2" in {
      square(1) shouldBe 1
    }
  }
}

final class SuiteA extends Suites(
  new ScalaJSExampleTest,
  new ScalaJSExampleTest2
)

final class SuiteB extends Suites(
  new ScalaJSExampleTest3,
  new ScalaJSExampleTest4
)

final class NestedSuite extends Suites(
  new SuiteA,
  new SuiteB) with StepwiseNestedSuiteExecution
