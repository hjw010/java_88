package test.test0525;

public class ShinhanBank extends Bank {

	
	private String event;
	
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(event);
	}
	
}
