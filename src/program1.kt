fun main(args: Array<String>) {
    val x: String? = readLine()
    if (x==null) return

    println(getYearEra(x))
}

fun getYearEra(a:String):String{
    var b:String

    when {
        a.toInt()<1970 -> b = "before"
        ((a.toInt()<2000)&&(a.toInt()>=1970)) -> b = "after (XX century)"
        (a.toInt()>=2000)&&(a.toInt()<2100) -> b = "after (XXI century)"
         a.toInt()==1970 -> b = "equals"
        else -> b = "distant future"
    }
    return b}
