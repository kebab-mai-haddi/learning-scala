class Rational(n: Int, d: Int):
    require(d != 0)
    val numer: Int = n
    val denom: Int = d
    override def toString = s"$numer/$denom"
    def add(that: Rational): Rational =
        Rational(
            numer * that.denom + that.numer * denom, denom * that.denom
        )