import java.util.Random
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var vplus = 0
    var vminus = 0
    var ranm1: String
    var ranm2: String

    for (i in 1..20){

    val random1 = (-10..10).random()
    val random2 = (-10..10).random()

        if (random1 >= 0){
            ranm1 = random1.toString()
        } else {
            ranm1 = random1.toString()
        }
        if (random2 >= 0){
            ranm2 = random2.toString()
        } else {
            ranm2 = "("+random2+")"
        }

    print("$ranm1 * $ranm2 = ")
    val asd = scanner.nextInt()
    val random = random1 * random2
   if (asd == random){
       vplus++
       println("ans $vplus : $vminus")

   } else {
       vminus++
       println("ans $vplus : $vminus")
       println("No :"+random)

   }

    }


}