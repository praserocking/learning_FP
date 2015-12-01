object basics extends App{
	
	def fibanocci(a:Int) : Int = if(a == 1 || a == 2) a else (fibanocci(a-1) + fibanocci(a-2))
	
	def factorial(a:Int) : Int = if(a == 1) a else a * factorial(a-1)
	
	val _toh_helper = (src: String, dst: String) => println("move "+src+" to "+dst+"\n")
	def toh(src: String, intr: String, dest: String, n:Int) : Unit = if(n == 1)_toh_helper(src,dest) else {toh(src,dest,intr,n-1);_toh_helper(src,dest);toh(intr,src,dest,n-1)}
	
	println(fibanocci(5))
	println(factorial(5))
	println(toh("A","B","C",3))
}