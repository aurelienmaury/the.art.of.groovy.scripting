package goldpot

class JmxtargetService {

  static expose = ['jmx']

  boolean winnerIs(String name) {
    new JmxWinner(name: name).save()
  }
}
