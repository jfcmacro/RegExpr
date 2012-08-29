package co.edu.eafit.dis.st0270.regexpr;

public class RegExprVisitorIsEmpty
    implements RegExprVisitor {

    private boolean isEmpty = true;

    public boolean getIsEmpty() {
	return isEmpty;
    }

    public void visit(RegExpr anRegExprElem) {
    }

    public void visit(Empty anEmptyElem) {
    }

    public void visit(Literal anLiteralElem) {
	this.isEmpty = false;
    }

    public void visit(Union anUnionElem) {
	RegExprVisitorIsEmpty leftVisitor = new RegExprVisitorIsEmpty();
	RegExprVisitorIsEmpty rightVisitor = new RegExprVisitorIsEmpty();

	RegExpr left = anUnionElem.getLeftRegExpr();
	RegExpr right = anUnionElem.getRightRegExpr();

	left.accept(leftVisitor);
	right.accept(rightVisitor);

	this.isEmpty = leftVisitor.getIsEmpty() && rightVisitor.getIsEmpty();
    }

    public void visit(Concatenation anConcatenationElem) {
	RegExprVisitorIsEmpty leftVisitor = new RegExprVisitorIsEmpty();
	RegExprVisitorIsEmpty rightVisitor = new RegExprVisitorIsEmpty();

	RegExpr left  = anConcatenationElem.getLeftRegExpr();
	RegExpr right = anConcatenationElem.getRightRegExpr();

	left.accept(leftVisitor);
	right.accept(rightVisitor);

	this.isEmpty = leftVisitor.getIsEmpty() || rightVisitor.getIsEmpty();
    }

    public void visit(Closure anClosureElem) {
	this.isEmpty = false;
    }
}
