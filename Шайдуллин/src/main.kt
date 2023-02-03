import java.lang.Exception

fun main()
{
    try
    {
        // Number 1
        println("Введите чисдо a: ")
        var a = readLine()!!.toInt()

        println("Введите число d: ")
        var d = readLine()!!.toInt()

        println(task1(a, d))
        //

        // Number 26

        println("Введите чисдо x: ")
        val x = readLine()!!.toInt()

        println("Введите число y: ")
        val y = readLine()!!.toInt()

        println("Введите число z: ")
        val z = readLine()!!.toInt()

        println("Введите коэфицент a: ")
        a = readLine()!!.toInt()

        println("Введите коэфицент b: ")
        val b = readLine()!!.toInt()

        println("Введите коэфицент c: ")
        val c = readLine()!!.toInt()

        println("Введите  коэфицент первой полуплоскости: ")
        d = readLine()!!.toInt()


        println(task26(x, y, z, a, b, c, d));
        //

    } catch (e: Exception)
    {
        println("Вооодимые данне не могут быть числом!")
        System.exit(1)
    }
}