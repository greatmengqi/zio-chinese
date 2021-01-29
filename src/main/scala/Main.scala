import zio._
import zio.console.putStrLn

object Main extends App {
  import zio.Runtime
  val runtime: Runtime[Any] = Runtime.default
  // runtime: Runtime[Any] = zio.Runtime$$anon$3@f4e6c0e
  class ExampleSpec3 extends FunSuite {
    test("addition works") {
      assert(runtime.unsafeRun(ZIO.succeed(1 + 1)) === 2)
    }
  }
}
