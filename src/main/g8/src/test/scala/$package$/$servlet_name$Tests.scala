package $package$

import org.scalatra.test.scalatest._

// For more on ScalaTest, see http://www.scalatest.org/getting_started_with_fun_suite
class $servlet_name$Tests extends ScalatraFunSuite {
  addServlet(classOf[$servlet_name$], "/*")

  test("simple get") {
    get("/") {
      status should equal (200)
      body should include ("Hello")
    }
  }
}
