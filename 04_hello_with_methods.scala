println((1).+(34))
println((189).+(348))
println((145).-(34))


var myList = new Array[String](3)
println("Position zero: " + myList(0)) // return a null value
myList.update(0, "CICCIAPUZZAEMOLLA")
println("Position zero: " + myList(0))


for(index <- 0 to myList.length-1){
	myList.update(index, s"cicciapuzzaemolla $index") //use to inject piece content of var like .format() python or %s ("ciccia") python
}
myList.foreach(elem=>println(elem))


var asd = Array("Hello", "CICCIAPUZZA E MOLLAAAA!!!")
println(asd(0))
asd = Array.apply("Hello", "World!!!")

println(s"at the end always  $asd(0)-$asd(1)")
