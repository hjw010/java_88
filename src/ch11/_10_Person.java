package ch11;

import java.io.Serializable;

public class _10_Person implements Serializable{

	
	private static final long serialVersionUID = 1505936280775101496L;
	private String name;
	private String job;
	//transient String job;
	
	
	public _10_Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return name +" "+ job;
	}
	
	
	
	
	
	
}
