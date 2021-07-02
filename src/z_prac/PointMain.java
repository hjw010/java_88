package z_prac;

public class PointMain {

	public static <T, V, C>double makeRec(Point<T, V> p1, Point2<T, V,C> p2) {
		double d1 = ((Number)p1.getX()).doubleValue();
		double d2 = ((Number)p2.getX()).doubleValue();
		double d3 = ((Number)p1.getY()).doubleValue();
		double d4 = ((Number)p2.getY()).doubleValue();
		double result = d1+d2+d3+d4; 
		
		double result2 = result + ((Number)p2.getC()).intValue();
		return result2;
	}
	
	
	public static void main(String[] args) {
		
		Point<Integer, Double> p1 = new Point<Integer, Double>(20, 30.0);
		Point2<Integer, Double,Integer> p2 = new Point2<Integer, Double, Integer>(30, 20.0,100);
		

		double d = PointMain.makeRec(p1,p2);
		
		System.out.println(d);
	}
	
}
