package ch10;

public class _01_ArrayException {
	public static void main(String[] args) {
		
		/*
		 *  p487
		 *  예외 처리 목적 : 정상종료
		 *  
		 *  try(){
		 *  	//예외가 발생할 수 있는 코드 부분
		 *  }catch(처리할 얘외타입 e){
		 *  	//try 블록 안에서 예외가 발생했을 때 예외를 처리하는 부분
		 *  }finally{
		 *  	//항상 수행되는 부분(예외가 발생하지 않더라도), 주로 자원해제를 위한 close() 문장이 온다,
		 *  }
		 *  
		 *  
		 */
		
		int[] array = new int[5];
		
		
		try {
			for (int i = 0; i <= array.length; i++) {
				array[i] = i;
				System.out.println(array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("오류 메세지 : " + e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("========무조건 수행===========");
		}
		
		
		
		
	}
}
