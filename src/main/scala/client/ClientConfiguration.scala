package client

class ImproperlyConfiguredException(msg: String) extends Exception(msg: String)
class InvalidCommandException(msg: String) extends Exception(msg: String)

class ClientConfiguration {
  val apiKey = sys.env.get("TOGGL_KEY") match {
    case Some(key) => key
    case None => throw new ImproperlyConfiguredException("Cannot find any key in sys.env")
  }

  val clientName: String = "Toggl CLI Client"
}

object Endpoints {
  val userData: String = "https://www.toggl.com/api/v8/me"
  val currentTimeEntry: String = "https://www.toggl.com/api/v8/time_entries/current"
}
