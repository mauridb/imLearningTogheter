val big = new java.math.BigInteger("12345") // val is used to declar variable
println(big)

println("\n#################################\n")
println("\n#################################\n")

val myList = new Array[String](3) 
myList(0) = "Ciccia\n"
myList(1) = "Puzza\n"
myList(2) = "Molla\n"

// foreach statement from to
for(index <- 0 to myList.length-1) 
	print(myList(index))


println("\n#####################\n")
println("\n COMPLETED \n")
println("\n#####################\n")
