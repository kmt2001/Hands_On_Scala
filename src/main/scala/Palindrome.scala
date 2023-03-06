object Palindrome{
  def checkPalindrome(string: String): String = {
    try {
      val reversed_string = string.reverse
      /* We use the reverse method of the String class to reverse
         the string and assign the result to the reversedStr variable*/
      if (string == reversed_string) {
        "YES"
      } else {
        "NO"
      }
    } catch {
      case exception1: Exception => """An error occurred: """ + exception1.getMessage
    }
  }
}