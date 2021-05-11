class Rational (n: Int, d: Int):
    require(d != 0)

    private val g = gcd(n.abs, d.abs)
    
    val numer: Int = n / g
    val denom: Int = d / g

    def this(n: Int) = this(n, 1)  // auxiliary constructor

    override def toString = s"$numer/$denom"

    def +(that: Rational) : Rational = 
        Rational(
            numer * that.denom + denom * that.numer,
            denom * that.denom
        )
    
    def +(i: Int): Rational = 
        Rational(
            numer + i * denom, denom
        )

    def -(that: Rational): Rational = 
        this + that * -1

    def -(i: Int): Rational = 
        this + -1 * i

    def *(that: Rational) : Rational =
        Rational(
            numer * that.numer, denom * that.denom
        )

    def *(i: Int): Rational = 
        Rational(
            numer * i, denom
        )

    def /(that: Rational): Rational = 
        this * Rational(that.denom, that.numer)

    def /(i: Int): Rational = 
        this * Rational(1,i)

    def lessThan(that: Rational): Boolean = 
        this.numer * that.denom < that.numer * this.denom

    def max(that: Rational): Rational = 
        if lessThan(that) then that else this

    private def gcd(a: Int, b: Int): Int = 
        if b == 0 then a else gcd(b, a%b)
