val frases: List[String] = List("Hola mundo", "Programación funcional", "Scala es genial", "reduceLeft es poderoso")

    val palabraMasLarga: String = frases
      .flatMap(frase => frase.split("\\s+"))
      .reduceLeft((a, b) => if (a.length > b.length) a else b)
    println(s"La palabra más larga es: $palabraMasLarga")
