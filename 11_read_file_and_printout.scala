// better format

import scala.io.Source
if(args.length == 0){
	Console.err.println("Please give me some file to read!")
	System.exit(1)
}


// return length of the length
// line with length 10 -- 2
// line with length 3 --  1
def widthOfLength(s: String) = s.length.toString.length

val filereader = Source.fromFile(args(0))

val lines = filereader.getLines().toList

val longestLine = lines.reduceLeft(
	(a, b) => if(a.length > b.length) a else b
)

val maxWidth = widthOfLength(longestLine)


for(line <- lines){
	val numSpaces = maxWidth - widthOfLength(line)
	val padding = " " * numSpaces

	println(padding + line.length + " || " + line)
}




