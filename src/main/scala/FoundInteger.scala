object FoundInteger {
// a program that tells if an integer found within a string.
  def foundInteger(inputString: String): Boolean = {
    inputString.exists(_.isDigit)
  }

}
