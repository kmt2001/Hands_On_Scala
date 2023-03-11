object ProfilePicture {
  def uploadPhoto(length: Int, width: Int, heigth: Int): String = {
    try {
      if (width< length || heigth < length) {
        "UPLOAD ANOTHER"
      } else if (width == heigth) {
        "ACCEPTED"
      } else {
        "CROP IT"
      }
    } catch {
      case exception: Exception => {
        println("An error occurred: " + exception.getMessage)
        "ERROR"
      }
    }
  }
}
//END
