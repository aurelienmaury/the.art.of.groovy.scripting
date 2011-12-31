package goldpot

class JsonWinner {
  String name
  Date dateCreated

  static constraints = {
    name blank: false
  }
}
