package goldpot

class HomeController {

  def index() {

    [jmxWin: JmxWinner.list(sort: 'dateCreated', order: 'asc', max: 3)]
  }
}
