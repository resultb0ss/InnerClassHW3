import org.jetbrains.annotations.NotNull

fun main() {
    var array = arrayOf(1,23,234,0,6,7,4,3,5,0,45,56,)
    var a = array.indexOfFirst { it == 0 }
    var b = array.indexOfLast { it == 0 }
    var count = 0

    for (num in a..b){
        count+=1
    }
    println(count-2)

}