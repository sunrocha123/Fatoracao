object Calculo extends App{
  val calculoFatorial = new Factorial
  println(calculoFatorial.recursaoCalculo(100).printResultado)
}

class Factorial (accumulator: BigInt = 1) {

  def *(numero: Int): Factorial = {
    new Factorial(accumulator * numero)
  }

  def recursaoCalculo(numero:Int): Factorial = {
    if (numero <= 1) this
    else *(numero).recursaoCalculo(numero - 1)
  }

  def printResultado: String = s"Resultado: $accumulator"
}
