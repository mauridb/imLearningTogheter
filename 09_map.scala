// immutable map
val romanNum = Map(1->"I", 2->"II", 3->"III")

println(romanNum)
println(romanNum(1))


println("\n##########\n")


import scala.collection.mutable
val engIta = mutable.Map("one"->"uno")
engIta += ("two"->"due")
engIta += ("three"->"tre")
engIta += ("for"->"quattro")
engIta += ("five"->"cinque")

println(engIta)
println(engIta("two"))


println("\n ########### \n")


val intEnglish = mutable.Map[Int, String]()
intEnglish += (1->"one")
intEnglish += (2->"two")
intEnglish += (3->"three")

println(intEnglish)

