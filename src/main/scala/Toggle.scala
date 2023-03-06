object Toggle {
  def changeCase(inputString: String): String = {
    inputString.map(c => if (c.isLower) c.toUpper else c.toLower)
  }
}
