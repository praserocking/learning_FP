// e^x evaluvation
def epowx(x: Float):Float=
  {   
       def factorial(a:Int) : Int = if(a==0) 1 else if(a == 1) a else a * factorial(a-1)
       return (0 to 9).map(i => scala.math.pow(x,i)/factorial(i)).foldLeft(0.0f)(_.toFloat+_.toFloat)
  }

// Sum of odd elements
def f(arr:List[Int]):Int = (0 /: arr.filter(_%2!=0)){_+_}

// Reverse a List
def f(arr:List[Int]):List[Int] = (arr.length-1 to 0 by -1).map(x=>arr(x)).toList

//Filter positions in the list
def f(arr:List[Int]):List[Int] = arr.indices.collect{case x if x%2!=0 => arr(x)}.toList

//Filter array
 def f(delim:Int,arr:List[Int]):List[Int] = arr.filter(x => x<delim)
 
 //List Replication
 def f(num:Int,arr:List[Int]):List[Int] = arr.flatMap(x => List.fill(num)(x))
 
 //N times Hello world
 def f(n: Int) = for(i <- 1 to n)println("Hello World") 
 
 //Pascal's Triangle
 object Solution {
    def main(args: Array[String]) {
            def fact(x:Int) : Int = if(x==0) 1 else if(x==1) 1 else x*fact(x-1) 
            val n = readLine().toInt
            def calc(q:Int, r:Int) : Int = (fact(q)/(fact(r)*fact(q-r)))
            
                (1 to n).zipWithIndex
                        .map{case(v,i) => (1 to v).zipWithIndex
                                                  .map{case(vv,ii) => calc(i,ii)}
                                                  .mkString(" ")}
                        .foreach{println(_)}
    }
}

//String-o-permute

object Solution {
    def main(args: Array[String]) {
        val t = readLine().toInt
        for(i <- 1 to t) println(readLine().grouped(2).map(_.reverse).mkString(""))
    }
}
