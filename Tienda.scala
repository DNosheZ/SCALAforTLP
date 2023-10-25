case class Producto(nombre: String, cantidad: Int, SKU: String, categoria: String, precio: Double)

def segmentarPorCategoria(productos: List[Producto]): Map[String, List[Producto]] = {
  productos.groupBy(_.categoria)
}

var carrito: List[Producto] = List()

def agregarAlCarrito(producto: Producto): Unit = {
  carrito = producto :: carrito
}

def productoMasCostoso(): Producto = {
  carrito.maxBy(p => p.precio * p.cantidad)
}

def totalCuenta(): Double = {
  carrito.map(p => p.precio * p.cantidad).sum
}

def ordenarRecursivo(productos: List[Producto]): List[Producto] = productos match {
  case Nil => Nil
  case x :: xs => ordenarRecursivo(xs.filter(_.cantidad <= x.cantidad)) ++
                  x ::
                  ordenarRecursivo(xs.filter(_.cantidad > x.cantidad))
}

def ordenarFuncional(productos: List[Producto]): List[Producto] = {
  productos.sortBy(_.cantidad)
}

def imprimirMensaje(producto: Producto): Unit = {
  println(s"Se han comprado ${producto.cantidad} productos a un valor unitario ${producto.precio}, para un total de: ${producto.cantidad * producto.precio}")
}

import java.time.LocalDate
import java.time.DayOfWeek

def productosConDescuento(): List[Producto] = {
  if (LocalDate.now().getDayOfWeek == DayOfWeek.TUESDAY) {
    carrito.filter(_.categoria == "mascotas").map(p => p.copy(precio = p.precio * 0.8))
  } else {
    List()
  }
}
