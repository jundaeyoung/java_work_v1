package ch02;

public class MainTest1 {

	public static void main(String[] args) {
		
		Television television = new Television();
		Refrigerator refreigerator = new Refrigerator();
		ToyRobot robot = new ToyRobot();
		ToyCar toyCar = new ToyCar();
		
		// 다형성
		RemoteController controller1 = television;
		RemoteController controller2 = refreigerator;
		RemoteController controller3 = robot;
		RemoteController controller4 = toyCar;
		
		// 다형성 + 배열
		RemoteController[] remoteControllers = new RemoteController[4];
		remoteControllers[0] = television;
		remoteControllers[1] = refreigerator;
		remoteControllers[2] = robot;
		remoteControllers[3] = toyCar;
		
		// 문제 1
		// for 문을 활용해서 전원을 전부 켜주세요.
			for(int i = 0 ; i < remoteControllers.length; i++) {
				remoteControllers[i].turnOn();
			}
		
		// 문제2
		// index값이 3 번째 녀석이면 자기 자신의 타입을 확면에 출력해 주세요.
			for (int i = 0; i < remoteControllers.length; i++) {
				if(i ==3 ) {
					System.out.println("3번째 인덱스인 녀석은 toyCar 데이터 타입입니다.");
				}
			}
		
		// 문제 3
		// 만약 데이터 toyRobot 이면 멤버 변수 name 값을 출력해주세요.
			for(int i = 0 ; i < remoteControllers.length; i++) {
				if(remoteControllers[i] instanceof ToyRobot) {
					// 부모 타입으로 업케스팅 된 상태
					// 자식 타입으로 바라보기 위해서는 다운캐스팅 해야한다.
					System.out.println(((ToyRobot)remoteControllers[i]).name);
				}			
			}
			
			// 문제 4
			// 장난감 로봇에 소리 기능을 추가해 달라는 요청
			// 냉장고에도 소리나는 기능을 추가해 달라고 요청
			// 소리 기능 --> 인터페이스로 설계
			// 냉장고 소리기능은 글자로 출력 띠리리링
			// 장난감  --> 두두두 뚜두~~ 새삥~
		
	}// end of main
}// end of class
