def mcd(a: Int, b: Int): Int = {
      if (b == 0) a
      else mcd(b, a % b)
    }
