case class CustomerDetails(accountNumber: Int,
                           username: String,
                           address: String,
                           previousUnits: Int,
                           currentUnits: Int)

object ElectricityBillCalculator extends App {

  def calculateBill(customer: CustomerDetails): Double = {
    val totalUnits = customer.currentUnits - customer.previousUnits
    val totalAmount = calculatePrice(totalUnits)
    val gst = totalAmount * 0.18
    val totalBillWithGst = totalAmount + gst
    totalBillWithGst
  }

  def calculatePrice(units: Int): Double = {
    try {
      if (units <= 0) throw new ArithmeticException("Units should be greater than 0")
    }
    catch {
      case ex: ArithmeticException => println(ex.getMessage)
    }

    if (units > 0 && units <= 250) {
      val pricePerUnit: Double = 5.25
      val billForFirstSlab: Double = units * pricePerUnit
      billForFirstSlab
    }
    else if (units > 250 && units <= 450) {
      val pricePerUnit: Double = 6.75
      val billForFirstSlab: Double = 250 * 5.25
      val billForSecondSlab: Double = (450 - units) * pricePerUnit
      val totalSlabBill: Double = billForSecondSlab + billForFirstSlab
      totalSlabBill
    }
    else {
      val pricePerUnit: Double = 8.50
      val billForFirstSlab: Double = 250 * 5.25
      val billForSecondSlab: Double = (450 - 250) * 6.75
      val billForThirdSlab: Double = (units - 450) * pricePerUnit
      val totalSlabBill: Double = billForFirstSlab + billForSecondSlab + billForThirdSlab
      totalSlabBill
    }
  }
}

