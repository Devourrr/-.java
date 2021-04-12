package week04_day1;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//조심 Student형 참조형변수 3개를 배열로 만든 것입니다.
		// Student형 객체가 만들어진 것이 아닙니다.
		Student[] students = new Student[3];
		
//		students[0].calc(); 
		//NullPointerException 발생, 값을 가르키는대상이 없다
		
		students[0] = new Student ("김학생",50,90);
		students[1] = new Student ("이학생",80,90);
		students[2] = new Student ("박학생",60,70);
		
		for( int i=0; i< students.length; i++) {
			students[i].calc();
//			students[0].calc();
//			students[1].calc();
//			students[2].calc();
		}
		for(int i=0; i< students.length; i++) {
			System.out.println(students[i].toString());
//			students[0].toString();
//			students[1].toString();
//			students[2].toString();
		}
	}

}
