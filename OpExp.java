public class OpExp extends Exp {
	final public static int Plus=1, Minus=2, Times=3, Div=4;
	public Exp left, right; 
	public int oper;

	public OpExp(Exp l, int o, Exp r) {
		right = r;
		left  = l; 
		oper  = o; 
	}
}