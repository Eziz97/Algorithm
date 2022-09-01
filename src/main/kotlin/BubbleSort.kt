

fun main() {

    var nomers1 = intArrayOf(9, 3, 5, 2, 1, 7, 78, 12, 14, 15, 11, 23, 10)
    bubbleSort(nomers1)
    for (i in nomers1) {
        print("$i ")

    }
}

fun bubbleSort(nomers: IntArray): IntArray {
    var flag = false
    for (i in 0..nomers.size - 2) {
        for (j in 0..nomers.size - 2 - i) {
            if (nomers[j] > nomers[j + 1]) {
                var timeJ = nomers[j]
                nomers[j] = nomers[j + 1]
                nomers[j + 1] = timeJ
                flag = true
            }

        }
        if (!flag) break
    }
    return nomers
}