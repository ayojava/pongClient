import com.github.andyglow.websocket.WebsocketClient

object PongClient extends App{

  val cli = WebsocketClient[String]("ws://localhost:8081/server") {
    case str =>
      println(s"<<| $str")
  }

  // 4. open websocket
  val ws = cli.open()

  // 5. send messages
  ws ! "hello" // basically fire and forget
  ws ! "ping"
}
