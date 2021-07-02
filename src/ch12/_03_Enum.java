package ch12;

enum Animal{CAT, DOG, COW}

public class _03_Enum {
		
		/*
		 * enum : 열거형
		 * 
		 * 1. 정의 : 여러개의 상수들을 모아서 만든 객체를 의미한다.
		 * 2. 작성방법 : enum 열거형명{상수1, 상수2, ... 상수n}
		 * 3. 용도 : 제한된 상수값만을 사용하고자 할 때 
		 * 4. 접근방법 : 1) 열거형명.상수 
		 * 			   2) 열거형명.상수.ordinal() -> index
		 * 
		 * 5. 특징 : switch (변수/수식)에서 변수타입으로 enum을 사용할 수 있다.
		 * 			ordinal()메서드를 이용해서 순서값을 얻어올 수 있다.
		 * 			ordinal()메서드는 0부터 시작한다.
		 */
	
	private Animal kind;
	private String name;
	
	public _03_Enum() {
		super();
	}

	public _03_Enum(Animal kind, String name) {
		super();
		this.kind = kind;
		this.name = name;
	}

	public Animal getKind() {
		return kind;
	}

	public void setKind(Animal kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	@Override
	public String toString() {
	return kind + " " + name;
	}
	
		
		
		
		

}
