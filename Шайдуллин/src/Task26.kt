

fun task26(x: Int, y: Int, z: Int, a:Int, b:Int, c:Int, d:Int): String {


    var k = 0
    k = a * x + b * y + c * z + d

    return when {
        k > 0 -> "Точка находится в верхней полуплоскости"
        k == 0 -> "Точка лежит на плоскости"
        else -> "Точка не принадлежит плоскости"
    }
}