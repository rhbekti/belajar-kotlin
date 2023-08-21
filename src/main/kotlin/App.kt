fun main()
{
    println("Hallo, Rahman Pambekti")

    // string
    var company: String = "Dicoding"
    println(company)

    // menggunakan also
    var firstName: String = ("Rahman").also { println(it) }
    // menggunakan apply
    var lastName: String = ("Pambekti").apply { println(this) }

    // char
    var vocal: Char
    'A'.also { vocal = it }
    vocal.also { println(it) }

    println(setUser("Rahman", 21))

    // if expressions
    val openHours = 7
    val now = 20
    val office: String
    if(now > openHours){
        office = "Office already open"
    }else{
        office = "Office is closed"
    }

    println(office)

    // array
    val array = arrayOf(1,3,5,7)
    val mixArray = arrayOf(1,2,"Dicoding",true)

    println(array[3])
    println(mixArray[2])

    // safe calls operator (?.)
    val text: String? = null
    text?.length

    // Elvis Operator(?:)
    val text2: String? = null
    val textLength = text2?.length ?: 7
}

// function
fun setUser(name: String,age: Int) : String {
    return "Your name is $name, and your age $age years old"
}

// bisa juga seperti ini
// fun setUser(name: String,age: Int) : String  = "Your name is $name, and your age $age years old"