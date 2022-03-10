fun main(){

    var a =plc("codeHive")
println(a)


    var r = ret(4,7)
    println(r)

    var t = det("Hilda",7)
    println(t)

var e = len("james")
    println(e)


}

fun plc(a:String):String {
   var m = " codeHive"
    return m
}
fun ret(num1:Int,num2:Int):Int{
    var mod   = num1 % num2
return mod
}


fun det(p:String,z:Int):String{

    var h ="Hi my name is $p and i am $z years old"
    return h
}

fun len(o:String):Int{
    var s = "o".length
    return s
}