package week04_day1;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[3];
		Scanner sc = new Scanner(System.in);// 스캐너는 통로 콘솔로 입력해주는 통로
	
		for(int i=0; i< students.length; i++) {
			System.out.print("이름:");String name = sc.next();
			System.out.print("국어:");int kor = sc.nextInt();
			System.out.print("영어:");int eng = sc.nextInt();
			
			students[i] = new Student(name, kor, eng);
		}
		//처리
		for (int i=0; i< students.length; i++) {
			students[i].calc();
		}
		//출력
		for (int i=0; i< students.length; i++) {
			System.out.println(students[i].toString());
		}
	}

}
