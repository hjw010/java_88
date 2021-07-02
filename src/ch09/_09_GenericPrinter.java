package ch09;

/*
 * T의 자료형이 정해지는 순간은 제네릭 클래스의 인스턴스가 생성되는 순간이다.
 * 따라서 클레스맴버는 T의 자료형이 결정되는 시점보다 빠르기 때문에
 * static 변수의 자료형이나, static메서드 내부의 자료형으로 T를 사용할 수 없다. 
 */
public class _09_GenericPrinter<T> {

	//private static T meterial; Cannot make a static reference to the non-static type T
	private T meterial;

	public T getMeterial() {
		return meterial;
	}
	public void setMeterial(T meterial) {
		this.meterial = meterial;
	}
	
	@Override
	public String toString() {
		return meterial.toString();
	}
}
	
