package week04_day1;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� Student�� ���������� 3���� �迭�� ���� ���Դϴ�.
		// Student�� ��ü�� ������� ���� �ƴմϴ�.
		Student[] students = new Student[3];
		
//		students[0].calc(); 
		//NullPointerException �߻�, ���� ����Ű�´���� ����
		
		students[0] = new Student ("���л�",50,90);
		students[1] = new Student ("���л�",80,90);
		students[2] = new Student ("���л�",60,70);
		
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
