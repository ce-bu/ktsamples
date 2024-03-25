package scratch

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        printHello()
    }
}

suspend fun printHello()
{
    print("Hello ")
    delay(2000)
    println("Kotlin")
}