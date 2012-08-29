package co.edu.eafit.dis.st0270.regexpr;

public class Closure extends RegExpr {

    private RegExpr regexpr;

    public Closure(RegExpr regexpr) {
	this.regexpr = regexpr;
    }


    public RegExpr getChildRegExpr() {
	return regexpr;
    }

    public void accept(RegExprVisitor visitor) {
	visitor.visit(this);
    }
}
