package week04_day1;

//지시서, type, 틀, 클래스 = 사용자정의 자료형
class Student{
	//멤버변수, 인스턴스변수, 속성(attribute), 필드
	private String name;
	private int kor;
	private int eng;
	private int tot;
	private double avg;
	
	// 변수의 값 초기화 => 생성자
	public Student() {
		
	}
	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
	}
	//출력메서드
	public String toString() {
		return "이름 "+ name +" 국어 "+  kor+" 영어 " + eng +" 합계 "+tot+" 평균 "+avg;
		
	}
	public void calc() {
		tot = kor + eng; //합계 구하는 기능
		avg = tot/2.0; // 평균 구하는 기능
	}
	// 변수를 이용하는 기능 => 멤버 메서드
}


public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("김길동",100,90);
		s.calc();
		System.out.println(s.toString());
	}

}
