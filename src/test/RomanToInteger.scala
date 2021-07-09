package test

object RomanToInteger {
  def romanToInt(s:String): Int = {
    if (s.isEmpty) 0
    else if (s.startsWith("CM")) 900 + romanToInt(s.substring(2))
    else if (s.startsWith("CD")) 400 + romanToInt(s.substring(2))
    else if (s.startsWith("XC")) 90 + romanToInt(s.substring(2))
    else if (s.startsWith("XL")) 40 + romanToInt(s.substring(2))
    else if (s.startsWith("IX")) 9 + romanToInt(s.substring(2))
    else if (s.startsWith("IV")) 4 + romanToInt(s.substring(2))
    else s(0) match {
      case 'I' => 1 + romanToInt(s.substring(1))
      case 'V' => 5 + romanToInt(s.substring(1))
      case 'X' => 10 + romanToInt(s.substring(1))
      case 'L' => 50 + romanToInt(s.substring(1))
      case 'C' => 100 + romanToInt(s.substring(1))
      case 'D' => 500 + romanToInt(s.substring(1))
      case 'M' => 1000 + romanToInt(s.substring(1))
      case _ => 0
    }
  }
}
