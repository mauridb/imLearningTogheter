// todo: immutable??
import scala.collection.immutable.HashSet

// TODO: what is the different beetween val and var
val mauriHashSet = HashSet("Hello", "i am", "mister")
println(mauriHashSet + "SCALA!")
println(mauriHashSet)


// mutable ???
import scala.collection.mutable
var mauriMutableHashSet = mutable.HashSet("hello", "i m", "mister")
mauriMutableHashSet.+=("BOOM!")

println(mauriMutableHashSet)
