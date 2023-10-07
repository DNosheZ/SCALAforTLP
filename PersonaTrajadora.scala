object Main extends App{
  class Persona(val nombre: String, val edad: Int, val cedula: Int, val peso: Double, val altura: Double){
          def infoPersona()
          def calcularIMC(peso:Double,altura:Double): Double ={ peso/(altura * altura)}
          def esMayorDeEdad(edad:Int): Boolean ={ edad >= 18}
          def presentacion(nombre:String, edad:Int, cedula:Int): String = {s"Hola!, mi nombre es $nombre con cedula $cedula y tengo $edad años."}
      }
      class Trabajador(nombre: String, edad: Int, cedula: Int, peso: Double, altura: Double, val profesion: String)
          extends Persona(nombre, edad, cedula, peso, altura) {
          def infoTrabajo()
          def obtenerProfesion: String = profesion
          }
      }
}
