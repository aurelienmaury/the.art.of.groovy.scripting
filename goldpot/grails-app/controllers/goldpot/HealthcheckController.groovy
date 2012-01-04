package goldpot

class HealthcheckController {

  def index() {
    response.status = 200
    render "OK"
  }
}
