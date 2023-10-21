object Main extends App{
    import scala.util.matching.Regex

    def filterAutomoviles(placas: List[String]): List[String] = {
      val pattern: Regex = """^[A-Z]{3} \d{3}$""".r
      placas.filter(placa => pattern.matches(placa))
    }
    
    def filterVehiculosCarga(placas: List[String]): List[String] = {
      val pattern: Regex = """^\d{3} [A-Z]$""".r
      placas.filter(placa => pattern.matches(placa))
    }
    
    def filterMotos(placas: List[String]): List[String] = {
      val pattern: Regex = """^[A-Z]{4,5}\d{3}$""".r
      placas.filter(placa => pattern.matches(placa))
    }

}
