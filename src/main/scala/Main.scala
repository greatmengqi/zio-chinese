import zio._
import zio.console.putStrLn

object Main extends App {
  trait Server {
    def shutdown(): Unit
  }

  lazy val makeServer: ZIO[Any, Throwable, Server] = ???

  lazy val server: ZManaged[Any, Throwable, Server] =
    ZManaged.make(makeServer)(server => ZIO.effectTotal(server.shutdown()))

  lazy val myProgram: ZIO[Any, Throwable, Nothing] = server.useForever
}
