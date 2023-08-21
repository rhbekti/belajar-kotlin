fun main()
{
    val color: Color = Color.valueOf("RED")
    println("Color is $color")
    println("Color value is ${color.value.toString(16)}")

    val color1: Array<Color> = enumValues()
    color1.forEach {
        col ->
        println(col)
        println(col.value.toString(16))
    }

    // ordinal untuk mengetahui posisi index
    val color2: Color = Color.GREEN
    println("Position GREEN is ${color2.ordinal}")

    // mengecek instance dari Enum
    when(color2)
    {
        Color.RED -> println("Color is RED")
        Color.GREEN -> println("Color is GREEN")
        Color.BLUE -> println("Color is BLUE")
    }
}

enum class Color(val value: Int)
{
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}