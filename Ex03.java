package week04_day1;

//���ü�, type, Ʋ, Ŭ���� = ��������� �ڷ���
class Student{
	//�������, �ν��Ͻ�����, �Ӽ�(attribute), �ʵ�
	private String name;
	private int kor;
	private int eng;
	private int tot;
	private double avg;
	
	// ������ �� �ʱ�ȭ => ������
	public Student() {
		
	}
	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
	}
	//��¸޼���
	public String toString() {
		return "�̸� "+ name +" ���� "+  kor+" ���� " + eng +" �հ� "+tot+" ��� "+avg;
		
	}
	public void calc() {
		tot = kor + eng; //�հ� ���ϴ� ���
		avg = tot/2.0; // ��� ���ϴ� ���
	}
	// ������ �̿��ϴ� ��� => ��� �޼���
}


public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("��浿",100,90);
		s.calc();
		System.out.println(s.toString());
	}

}
