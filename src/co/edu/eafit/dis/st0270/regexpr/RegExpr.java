package co.edu.eafit.dis.st0270.regexpr;

public abstract class RegExpr implements RegExprElement {

    public abstract void accept(RegExprVisitor visitor);
}
