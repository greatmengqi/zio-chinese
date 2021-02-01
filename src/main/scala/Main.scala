import zio._
import zio.console.putStrLn

object Main extends App {
  val genUser: Gen[Random with Sized, User] = for {
    name <- genName
    age <- genAge
  } yield User(name, age)
  // genUser: Gen[Random with Sized, User] = Gen( // zio.stream.ZStream$$anon$1@695a724a
  // )
}
