println(args)
if(args.length>0)
	args.foreach((arg: String)=>println(s"Hello world $arg"))
else
	println("Hello world noname!!")

println("\n### FINISH 1st ###\n")

// Shortest version
for (arg <- args)
	println(s"Hello world $arg!!")

println("\n### FINISH 2nd ###\n")
