var newsSet = Set("ciccia", "puzza")
newsSet += "cacchio"

println(newsSet.contains("cacca"))
println(newsSet.contains("alfa"))


println("\n##########\n")


import scala.collection.mutable
val nameSet = mutable.Set("Cacchio", "Mucca")
nameSet += "calderone"
println(nameSet)
