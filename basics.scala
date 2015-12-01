object sample extends App{
	
	def fibanocci(a:Int) : Int = if(a == 1 || a == 2) a else (fibanocci(a-1) + fibanocci(a-2))
	def factorial(a:Int) : Int = if(a == 1) a else a * factorial(a-1)
	
	println(fibanocci(5))
	println(factorial(5))
}