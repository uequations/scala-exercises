package exercise.tavant


case class User(name: String, id: String)

case class Movie(name: String, id: String)

case class Video(name: String, description: String, pixel: Int)

object FavoriteMovie {

  def getUserId(id: String): Option[User] = {
    id match {
      case "1" => Some(User("Mike", "1"))
      case _ => None
    }
  }

  def getFavoriteMovieForUser(user: User): Option[Movie] = user match {
    case User(name, id) => Some(Movie("Gigli", "101"))
    case _ => None
  }

  def getVideosForMovie(movie: Movie): Option[Vector[Video]] = movie match {
    case Movie(name, "101") => Some(
      Vector(
        Video("interview with Cast", "interview", 480),
        Video("gigli", "feature", 7260)
      ))
    case _ => None
  }

  def solve(id: String): Option[Vector[Video]] = {
    for {
      user <- getUserId(id)
      movie <- getFavoriteMovieForUser(user)
      video <- getVideosForMovie(movie)
    } yield {
      video
    }
  }
}
