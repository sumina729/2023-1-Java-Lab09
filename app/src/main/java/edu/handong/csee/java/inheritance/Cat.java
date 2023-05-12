package edu.handong.csee.java.inheritance;

public class Cat extends Animal {
	
	public static void main(String[] args){
		//자바에는 다형성(polymorphism) 개념이하나의 객체가 여러 가지 타입을 가질 수 있다.
		System.out.println("자바에는 다형성(polymorphism) 개념이하나의 객체가 여러 가지 타입을 가질 수 있다.");
		System.out.println("Animal a1 = new Animal(); -> 가능");
		System.out.println("Animal a2 = new Cat(); -> 가능");
		System.out.println("Cat a3 = new Animal(); -> 불가능");
		System.out.println("");
		
		Animal animal = new Animal();
		Animal cat = new Cat();
		Animal dog = new Dog();
		Animal monkey = new Monkey();
		
		Animal animal2 = new Animal();
		Cat cat2 = new Cat();
		Dog dog2 = new Dog();
		Monkey monkey2 = new Monkey();
		
		
		//자바의 오버라이딩 개념.
		System.out.println("자바의 오버라이딩 개념.");
		System.out.println("부모클래스의 메스드를 자식클래스가 재정의 할 수 있다.");
		System.out.println("Cat, Dog, Money는 부모클래스인 animal의 instansceMethod()메서드를 재정의 한다.");
		
		animal.instansceMethod();
		cat.instansceMethod();
		dog.instansceMethod();
		monkey.instansceMethod();
		
		System.out.println("");
		
		animal2.instansceMethod();
		cat2.instansceMethod();
		dog2.instansceMethod();
		monkey2.instansceMethod();
		
		System.out.println("");
		System.out.println("");
		

		
		//자바의 하이딩 개념.
		System.out.println("자바의 하이딩 개념.");
		System.out.println("오버라이딩이 되면 형 변환으론 부모 메소드에 접근할 수 없습니다.하지만 하이딩은 접근이 가능하다.");
		System.out.println("Animal cat = new Cat()이처럼 선언된 인스턴스는 부모클래스인 animal의 staticClaasMethd()를 출력한다");
		animal.staticClaasMethod();
		cat.staticClaasMethod();
		dog.staticClaasMethod();
		monkey.staticClaasMethod();
		
		System.out.println("");
		
		System.out.println("Cat cat = new Cat()이처럼 선언된 인스턴스는 부모클래스인 animal의 staticClaasMethd()를 출력한다");
		animal2.staticClaasMethod();
		cat2.staticClaasMethod();
		dog2.staticClaasMethod();
		monkey2.staticClaasMethod();
		
		
		
    }
	
	public static void staticClaasMethod(){
        System.out.println("고양입니다(staticClaasMethod)");
    }
	
    public void instansceMethod() {
    	//super.instansceMethod();
        System.out.println("고양입니다.(instansceMethod)");
    }

}
