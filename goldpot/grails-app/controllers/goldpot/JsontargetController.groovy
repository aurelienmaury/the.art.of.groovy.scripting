package goldpot

class JsontargetController {

  def index() {

    if (request.post && request.JSON) {
      def jsonBody = request.JSON

      def result = validate(jsonBody)

      if (result.success) {
        new JsonWinner(name: jsonBody.name).save()
      }

      render(contentType: "application/json") {
        result
      }
    } else {
      render "This controller only accepts JSON posts"
    }
  }

  private Map validate(jsonBody) {
    if (!jsonBody.name) {
      return [success: false, message: "attribute 'name' not supplied"]
    }



    return [success: true]
  }


}
