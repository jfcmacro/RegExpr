import co.edu.eafit.dis.st0270.regexpr.*;
import co.edu.eafit.dis.st0270.symbol.*;

public class Main {

    public static void main(String args[]) {

	RegExpr reg1 = new Empty();
	RegExpr reg2 = new Literal(new Zero());
	RegExpr reg3 = new Literal(new One());
	RegExpr reg4 = new Union(reg2, reg3);
	RegExpr reg5 = new Closure(reg4);

	RegExprVisitorIsEmpty revisit = new RegExprVisitorIsEmpty();
	reg1.accept(revisit);
	System.out.println("Is reg1 empty: " + revisit.getIsEmpty());
	reg2.accept(revisit);
	System.out.println("Is reg2 empty: " + revisit.getIsEmpty());
	reg3.accept(revisit);
	System.out.println("Is reg3 empty: " + revisit.getIsEmpty());
	reg4.accept(revisit);
	System.out.println("Is reg4 empty: " + revisit.getIsEmpty());
	reg5.accept(revisit);
	System.out.println("Is reg5 empty: " + revisit.getIsEmpty());
	System.exit(0);
    }
}