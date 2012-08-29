package co.edu.eafit.dis.st0270.regexpr;

public interface RegExprVisitor {

    public void visit(Empty anEmptyElem);
    public void visit(Literal anLiteralElem);
    public void visit(Union anUnionElem);
    public void visit(Concatenation anConcatenationElem);
    public void visit(Closure anClosureElem);
}
