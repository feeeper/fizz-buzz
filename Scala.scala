object FizzBuzz {
    def main(args: Array[String]) {
        (1 until 101).map(i => (i % 3, i % 5) match {
            case (0, 0) => "FizzBuzz"
            case (0, _) => "Fizz"
            case (_, 0) => "Buzz"
            case _ => i
        }).foreach(println)
    }
}
