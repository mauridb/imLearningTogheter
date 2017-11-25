// use to read lines from file
// run this file
// for me: ./scl/bin/scala my_scirpt.scal filetoread

import scala.io.Source

if (args.length > 0){
	// print line with foreach
	val readfile = Source.fromFile(args(0))
	for(line <- readfile.getLines())
		println(line.length+ "char detected: " + line)
	
}else
	Console.err.println("Please enter a correct filename.. try again")
