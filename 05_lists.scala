//immutable sequence we use List

val list_number = List(7,8,9);
var other_list_number = List(10,11,12)


// concatenation 
val concat_list = list_number ::: other_list_number
println(concat_list)


println(list_number + " and "+ " not mutated")
println("New list: "+concat_list)


println("\n@@@@@@@@@@@@@@@\n")


// append operation with the following operator '::', expect list on the right side
println(0 :: list_number)
println(list_number :: list_number)


println("\n@@@@@@@@@@@@@@@\n")



val random_int = 12 :: 23 :: 543 :: Nil
println(random_int)


println("\n@@@@@@@@@@@@@@@\n")


// mixed elem list
val wtf_is_this = List(23, "fdsafdsa", Nil, true, false, List())
println(wtf_is_this)


