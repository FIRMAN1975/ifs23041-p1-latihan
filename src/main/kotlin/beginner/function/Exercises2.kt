package org.delcom.beginner.function
import kotlin.math.PI
import java.util.Locale

fun main() {
    val area = circleArea(2)
    // Menggunakan US agar pemisah desimalnya titik (.), bukan koma (,)
    println(String.format(Locale.US, "%.2f", area))
}
