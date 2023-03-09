package ch04;

import java.util.ArrayList;

public class MainTest2 {
	public static void main(String[] args) {

		BuyDAO buyDAO = new BuyDAO();
		// insert 확인
//		int rowCount = buyDAO.insert(new BuyDTO("뉴진스", "지갑", 2000, 2));
//		System.out.println("rowCount" + rowCount);

		// select 확인
//		ArrayList<BuyDTO> list = buyDAO.select();
//		
//		for(int i=0; i<list.size(); i++) {
//			System.out.print(list.get(i).getUsername() +"\t");
//			System.out.print(list.get(i).getProdName() +"\t");
//			System.out.print(list.get(i).getPrice() +"\t");
//			System.out.print(list.get(i).getAmount() );
//			System.out.println();
//		}

		// update확인
//		BuyDTO dto = new BuyDTO("뉴진스","지갑",500,2);
//		int updateRowCount = buyDAO.update(dto, dto.getUsername());

		// delete 확인
//		buyDAO.delete("이승기");

	}
}
