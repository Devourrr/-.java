package week04_day1;
class Animal{
	
	
	
	void sleep() {System.out.println("잔다");}
	void work() {System.out.println("걷는다");}
}
class Cat extends Animal { //상속받는다, 부모, 자식, super, sub.조상,자손
	void catchMouse() { System.out.println("쥐를 잡는다");}
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
		animal = cat;//상속관계에선 부모형으로 참조하는게 가능하다
		// animal.catchMouse(); 사용불가
		// Animal animal = new Cat(); ok
		//부모형으로 부르는것(참조하는 것)ok, but 의미가 부모형으로 축소됨
		
		
		
		//downcasting
		Cat c = (Cat)animal;
		c.catchMouse();
		
		Animal a = new Animal();
		//Cat c1 = (Cat) a; 불가
		
		Dog dog = new Dog();
		dog.sleep();
		
		//상속관계에서 무엇이 가능하냐면, 부모형으로 참조하는 것이 가능하다
	}

}
