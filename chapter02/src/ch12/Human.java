package ch12;

//public abstract class Human extends Animal {  ---> 1번 방법
	public  class Human extends Animal {    // ---> 2번 방법

	@Override
	public void hunt() {
		System.out.println("휴면이 사냥을 합니다.");
		// TODO Auto-generated method stub
		
	}
		// 1. 추상 메서드를 포함하게 되면 추상 클래스로 만들어 주면된다.
		//	 2. 부모클래스에 있는 추상 메서드를 자식 클래스에서 일반 메서드로 재 정의 하였다.
}
