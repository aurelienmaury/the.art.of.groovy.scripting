package goldpot

class CsvWinner {
  String name
  Date dateCreated

  static constraints = {
    name blank: false
  }
}
