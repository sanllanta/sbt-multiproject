package co.s4n

object Calculadora2 {
  def sumar(numero1: Double, numero2: Double): Double = numero1 + numero2
  def multiplicar(factor1: Double, factor2: Double): Double = factor1 * factor2
  def potenciar(base: Double, exponente: Double): Double = scala.math.pow(base, exponente)
  def restar(numero1: Double, numero2: Double): Double = numero1 - numero2
  def dividir(dividendo: Double, divisor: Double): Double = {
    if (divisor != 0)
      dividendo / divisor
    else
      0
  }
}