package co.edu.eafit.dis.st0270.regexpr;

public class Union extends RegExpr {

    private RegExpr lregexpr;
    private RegExpr rregexpr;

    public Union(RegExpr lregexpr, RegExpr rregexpr) {

	this.lregexpr = lregexpr;
	this.rregexpr = rregexpr;
    }
}