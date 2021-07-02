package ch01;

public class _07_OperatorEx {
	public static void main(String[] args) {

		/*
		 * 
		 * 연산 1. 사칙연산자
		 * 
		 */
		System.out.println("=====사칙 연산자 예제=====");

		int num1 = 8;
		int num2 = 4;
		int addR = num1 + num2;
		int subR = num1 - num2;
		int mulR = num1 * num2;
		int divR = num1 / num2;
		int modR = num1 % num2;
		System.out.println("addr : " + addR + ", subR : " + subR + ", mulR : " + mulR + ", divR : " + divR + ", modR : " + modR);
		System.out.println(addR+subR+mulR+divR+modR);

		/*
		 * 2. 증감연산자
		 * 2.1 전위연산자: y = ++x; ->  ++x; y=x; 
		 *  x의 값을 증가 후 y에 대입
		 * 2.2 후위연산자: y = x++; ->  y=x; x++;
		 *  y에 x를 대입후 x의값 증가 
		*/	
		
		System.out.println("***********증감연산자*********");
		//전위 연산자
		int c = 5;
		int nextC = ++c; // ++c; nextC = c;  - c 증가후 대입
		System.out.println("c : "+ c); //6
		System.out.println("nextC : "+nextC); //6
	
		System.out.println();
		//후위 연산자
		int d = 5;
		int nextD = d++; // nextD = d; d++; - d 를 대입한후 증가
		System.out.println("d : "+d); //6
		System.out.println("nextD : " +nextD); //5
		
		int e=2, f=3, result =0;
		System.out.println(++e + --f * e--); // 3 + 2 * 3---9    
		System.out.println("e : " + e);//3-1 ---2
		System.out.println("f : " + f); //2
		
		result = ++e + --f * e--;
		System.out.println(result); // 3 + 1 * 3 -----6
		System.out.println(e); //3-1 ----2
		System.out.println(f); //1
		
		
		
		int h=2, i=3;
		
		System.out.println(h++ + --i * h--);// 2 + 2 * 3  8
		
		
		
		/*
		 * 연산
		 * 3. 관계연산자 : 같다(==), 같지 않다(!=), >, <, >=, <=
		 * 	- 결과값 boolean : 참(true), 거짓(false) 
		 * */
		
		System.out.println("*******관계 연산자 예제 ********");
		
		int c1 = 10;
		int c2 = 20;
		System.out.println("c1 == c2 : " + (c1 == c2)); //false
		System.out.println("c1 != c2 : " + (c1 != c2)); //true
		System.out.println("c1 > c2 : " + (c1 > c2)); //false
		System.out.println("c1 < c2 : " + (c1 < c2)); //true
		System.out.println("c1 >= c2 : " + (c1 >= c2)); //false
		System.out.println("c1 <= c2 : " + (c1 <= c2)); //true
		
		
	
		/*
	       * 4. 복합 연산자
	       * */
	      
	      int ii = 5;
	      ii+=10; // ii = ii + 10
	      System.out.println("ii : " + ii);
	      ii-=10;
	      System.out.println("ii : " + ii);
	      ii*=10;
	      System.out.println("ii : " + ii);
	      ii/=10;
	      System.out.println("ii : " + ii);
	      
	      /**
	       * 5. 논리연산자 : 1 -> 참(true), 0-> 거짓(false)
	       * &&(논리곱) : x && y -> x와 y 모두 참이면 참, 하나라도 거짓이면 거짓
	       * ||(논리합) : x || y -> x아 y중에서 하나만 참이면 참, 모두 거지싱면 거짓
	        * */
	      
	      int z1 = 4, y1 = 5;
	      
	      System.out.println((z1==4) && (y1==5));
	      System.out.println((z1==4) && (y1==10));
	   
	      System.out.println((z1==32) || (y1==25));
	      System.out.println((z1==4) || (y1==10));
	      
	   
	      /*
	       * 연산
	       * 6. 삼항연산자 : 항이 3개인 연산자를 의미하낟.
	       *                조건식 ? 결과1 : 결과2:  참이면 결과1 반환 거짓이면 결과2 반환
	       * */

	      int score = 90;
	      String resultStr = (score >=60)?"합격":"불합격"; 
	      System.out.println(resultStr);
	      
	      
	      int a = 7; //0000 0111 7
	      int b = a << 3; // 0011 1000 56
	      System.out.println(b);
	      b = b >> 3;
	      System.out.println(b);
		
		
		
		
		
		
		
		
	
	
	}
}
