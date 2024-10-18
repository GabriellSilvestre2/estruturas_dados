package src.Ordenação.Bubble_Sort

import src.Ordenação.Selection_Sort.selection_sort

fun bubble_sort(integers: Array<Int>) {
    for (i in 0 until integers.size-1){
        for (j in 1 until integers.size){
            if (integers[j-1] > integers[j]){
                var aux = integers[j-1]
                integers[j-1] = integers[j]
                integers[j] = aux
            }
        }
    }
}
fun main(){
    var integers: Array<Int> = arrayOf(10,1,2,3,9,8,7,4,5,6)
    bubble_sort(integers)
    println(integers.joinToString())
}