object Toggle {
  def changeCase(input_string: String): String = {
    try {
      input_string.map(character => {
        if (character.isUpper) character.toLower
        else if (character.isLower) character.toUpper
        else character
      })
    } catch {
      case _: Exception => throw new IllegalArgumentException("Invalid input string")
    }
  }
}
