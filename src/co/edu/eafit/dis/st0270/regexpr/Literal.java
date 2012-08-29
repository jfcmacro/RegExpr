package co.edu.eafit.dis.st0270.regexpr;

import co.edu.eafit.dis.st0270.symbol.Symbol;

public class Literal extends RegExpr {

    private Symbol symbol;

    public Literal(Symbol symbol) {

	this.symbol = symbol;
    }

    public Symbol getSymbol() {
	return symbol;
    }

    public void accept(RegExprVisitor visitor) {
	visitor.visit(this);
    }
}