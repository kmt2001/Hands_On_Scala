object ElectricityBillTest extends App {
  // Positive test cases
  assert(ElectricityBillCalculator.calculateBill(CustomerDetails(1, "krishna", "agra", 200, 400)) == 291.6)
  assert(ElectricityBillCalculator.calculateBill(CustomerDetails(2, "Manish", "delhi", 100, 300)) == 217.8)
  assert(ElectricityBillCalculator.calculateBill(CustomerDetails(3, "rahul", "pune", 0, 100)) == 525.0)

  // Edge test cases
  assert(ElectricityBillCalculator.calculateBill(CustomerDetails(4, "neha", "mumbai", 100, 100)) == 0.0)
  assert(ElectricityBillCalculator.calculateBill(CustomerDetails(5, "Jitin", "banglore", 450, 550)) == 85.5)
  assert(ElectricityBillCalculator.calculateBill(CustomerDetails(6, "pallav", "kanpur", 200, 200)) == 0.0)

  // Negative test cases
  assertThrows[ArithmeticException](ElectricityBillCalculator.calculatePrice(0))
  assertThrows[ArithmeticException](ElectricityBillCalculator.calculatePrice(-100))

}

