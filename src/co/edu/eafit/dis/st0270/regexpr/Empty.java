package co.edu.eafit.dis.st0270.regexpr;

public class Empty extends RegExpr {

    public void accept(RegExprVisitor visitor) {
	visitor.visit(this);
    }
}
