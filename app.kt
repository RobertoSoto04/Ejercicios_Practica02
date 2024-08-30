fun main() {
    val numeros = IntArray(4)
    
    for (i in 0 until 4) {
        while (true) {
            try {
                print("Ingresa un número entero: ")
                numeros[i] = readLine()?.toInt() ?: throw NumberFormatException("Entrada no válida")
                break
            } catch (e: NumberFormatException) {
                println("Por favor, ingresa un número válido.")
            }
        }
    }

    val numeroMayor = numeros.maxOrNull()

    println("El número mayor es: $numeroMayor")
}
