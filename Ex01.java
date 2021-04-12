package week04_day1;

import java.util.Random;

// Math.random(); // static 메서드
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double result = Math.random();
		System.out.println(result);
		int result2 = (int)(result*10);
		System.out.println(result2);
	
		// Random.nextInt(); //정수형 난수를 반환하는 메서드 static아님
		
		Random random = new Random();
		int result3 = random.nextInt();
		System.out.println(result3);
	}

}
