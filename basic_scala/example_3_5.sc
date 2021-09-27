def flexibleFizzBuzz(handleLine: (Int, String) => {}): Unit = {
    for (x <- Range.inclusive(1, 100)) {
        handleLine(
            x,
            if (x % 3 == 0 && x % 5 == 0){
                "FizzBuzz"
            }
            else if (x % 3 == 0){
                "Fizz"
            }
            else if (x % 5 == 0) {
                "Buzz"
            }
            else {
                x.toString
            }
        )
    }
}

val output = new Array[String](100)

flexibleFizzBuzz { (i,s) => 
    output(i) = s
}