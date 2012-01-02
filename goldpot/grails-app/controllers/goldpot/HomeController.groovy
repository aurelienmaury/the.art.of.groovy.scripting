package goldpot

class HomeController {

  def index() {

    def jmxWinners = JmxWinner.list(sort: 'dateCreated', order: 'asc', max: 3)
    def jsonWinners = JsonWinner.list(sort: 'dateCreated', order: 'asc', max: 3)

    [jmxWin: jmxWinners, jsonWin: jsonWinners]
  }
}
