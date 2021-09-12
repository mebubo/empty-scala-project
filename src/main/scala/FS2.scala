import fs2.io.file.Files
import fs2.io.file.Path
import fs2.Stream
import cats.effect.Concurrent
import cats.implicits._
import cats.effect.IO
import scala.concurrent.duration._

object FS2 {
  def totalBytes[F[_]: Files: Concurrent](path: Path): F[Long] =
    Files[F]
      .walk(path)
      .evalMap(p => Files[F].size(p).handleError(_ => 0L))
      .compile
      .foldMonoid

  def program[F[_]]: Stream[F, Unit] = ???
  val repeat = Stream.awakeEvery[IO](10.minutes) >> program
}
