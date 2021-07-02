package z_prac;

public class Point2<A,B,C> {

	private A x;
	private B y;
	private C c;
	
	public Point2(A x, B y , C c) {
		super();
		this.x = x;
		this.y = y;
		this.c = c;
	}

	public A getX() {
		return x;
	}
	public C getC() {
		return c;
	}

	public void setX(A x) {
		this.x = x;
	}

	public B getY() {
		return y;
	}

	public void setY(B y) {
		this.y = y;
	}
	
	
	
	
	
}
