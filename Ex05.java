package week04_day1;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[3];
		Scanner sc = new Scanner(System.in);// ��ĳ�ʴ� ��� �ַܼ� �Է����ִ� ���
	
		for(int i=0; i< students.length; i++) {
			System.out.print("�̸�:");String name = sc.next();
			System.out.print("����:");int kor = sc.nextInt();
			System.out.print("����:");int eng = sc.nextInt();
			
			students[i] = new Student(name, kor, eng);
		}
		//ó��
		for (int i=0; i< students.length; i++) {
			students[i].calc();
		}
		//���
		for (int i=0; i< students.length; i++) {
			System.out.println(students[i].toString());
		}
	}

}
