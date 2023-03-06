object PalindromeTest extends App {
  println(Palindrome.checkPalindrome("aba"))
  println(Palindrome.checkPalindrome("racecar")) // prints YES
  println(Palindrome.checkPalindrome("hello")) // prints NO
  println(Palindrome.checkPalindrome("A man a plan a canal Panama")) // prints YES
  println(Palindrome.checkPalindrome("")) // prints YES

}
