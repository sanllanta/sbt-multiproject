package co.s4n

import org.scalatest.FunSuite

/**
 * Created by yuji on 12/17/14.
 */
class MainTest extends FunSuite {

  test("Hello world!") {
    info("Testing the Hello world!")
    assert(Main.method01 === "Hello world!")
  }
}
