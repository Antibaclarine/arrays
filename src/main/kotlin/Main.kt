fun main(){
print()
gramatical()
    fullnumbers()
    printname("Clarine","Ann","Maggie")


}
fun print(){
var Countries= arrayOf("Uganda","Tanzania","Sudan","Kenya")
    println(Countries.contentToString())
}
fun gramatical(){
    var cities = arrayOf("Harare","Mumbai","Dodoma","Jakrata")
    println(cities.sortedArray().contentToString())
}
fun fullnumbers(){
    var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var addition= arrayOf(4,43)
    println(addition.sum())
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}
fun printname(name1: String,name2:String,name3: String):Array<String>{
    return arrayOf(name1,name2,name3)


}