package week04_day1;
class Animal{
	
	
	
	void sleep() {System.out.println("�ܴ�");}
	void work() {System.out.println("�ȴ´�");}
}
class Cat extends Animal { //��ӹ޴´�, �θ�, �ڽ�, super, sub.����,�ڼ�
	void catchMouse() { System.out.println("�㸦 ��´�");}
}

class Dog extends Animal {
	
}


public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat = new Cat();
		Animal animal; 
		cat.work();
		cat.catchMouse();
		//upcasting
		animal = cat;//��Ӱ��迡�� �θ������� �����ϴ°� �����ϴ�
		// animal.catchMouse(); ���Ұ�
		// Animal animal = new Cat(); ok
		//�θ������� �θ��°�(�����ϴ� ��)ok, but �ǹ̰� �θ������� ��ҵ�
		
		
		
		//downcasting
		Cat c = (Cat)animal;
		c.catchMouse();
		
		Animal a = new Animal();
		//Cat c1 = (Cat) a; �Ұ�
		
		Dog dog = new Dog();
		dog.sleep();
		
		//��Ӱ��迡�� ������ �����ϳĸ�, �θ������� �����ϴ� ���� �����ϴ�
	}

}
