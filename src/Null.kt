fun main() {
    val number: Int? = null
    // number = 12
    println(number?.plus(12)) // Value of 'number?.plus(12)' is always null. Cunku null ile bir sayiyi islemde kullanirken null olur
    // ?. kullanarak null olduğunda çalıştırmaz, null değilse çalıştırır.
    // eger !!. kullanirsak, NullPointerException alinir.
}