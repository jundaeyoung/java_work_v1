package ex_02;

import java.util.Random;
import java.util.Scanner;

public class ToyMainTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random(); 
		int randomNum=random.nextInt(3)+1;
		int randomToy=random.nextInt(3);
		System.out.println("1,2,3 중에 번호를 골라주세요");
		int userNum = sc.nextInt();

		Toy toy1 = new Money();
		Toy toy2 = new Snack();
		Toy toy3 = new Doll();

		Toy[] toys = new Toy[3];
		toys[0] = toy1;
		toys[1] = toy2;
		toys[2] = toy3;


		if (userNum == randomNum) {
			System.out.println("당첨 되었습니다.");
			toys[randomToy].showInfo();
			System.out.println("당첨된 상품은 "+toys[randomToy].name +" 입니다.");
			if (toys[userNum] instanceof Money) {
				String name = ((Money) toys[userNum]).name;
				System.out.println("축하합니다."+name);
//				Money money = new Money();
//				money.buy();
				((Money)toys[userNum]).buy();
			}

		} else {
			System.out.println("아쉽지만 당첨되지 않았습니다.");
		}

	}
}
