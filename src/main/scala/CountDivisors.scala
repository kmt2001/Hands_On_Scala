object CountDivisors {
  def countDivisibleNumbers(number1: Int, number2: Int, number3: Int): Int = {
    var count_divisibility = 0
    for (i <- number1 to number2) {
      if (i % number3 == 0) {
        count_divisibility += 1 //
      }
    }
    return count_divisibility
  }


}
