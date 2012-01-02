package goldpot

class JmxtargetService {

  static expose = ['jmx']

  Status myStatus

  boolean winnerIs(String name, String uuid) {
    if (uuid == myStatus.uuid) {
      new JmxWinner(name: name).save()
    } else {
      false
    }
  }
}
