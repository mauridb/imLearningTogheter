val mystring = "ciccia puzza e molla"

var my_raw_string = """hello
			i m measter scala!
			"""

println(my_raw_string)

var raw_string = """|Hello
		    |i m fine thank you""".stripMargin

println(raw_string)


val language = "Scala"

println(s"a new language $language!")
println(s"2*2 = ${2*2}")
println(f"PI: ${math.Pi}%.5f")
println(raw"Printing with no escaping\\\\\\\!!")

val onlytrue = true
val onlyfalse = !onlytrue // will be false

println(onlytrue, onlyfalse)
