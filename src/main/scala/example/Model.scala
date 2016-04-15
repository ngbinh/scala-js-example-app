package example

import io.circe.generic.JsonCodec
import io.circe.syntax._

@JsonCodec sealed trait A
case class B(b: String) extends A
case class C(c: Int) extends A

object A

object Test {
  B("abc").asJson.noSpaces
}
