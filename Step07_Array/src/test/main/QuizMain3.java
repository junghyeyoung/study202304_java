package test.main;

import java.util.Random;

public class QuizMain3 {
	public static void main(String[] args) {
		/*
		 *  2. run 했을 때
		 *     5개의 문자열 중에서 3개가 한줄에 한번에 랜덤하게 출력되게 해보세요.
		 *     예) cherry  |  apple  |  cherry
		 *         7  |  apple  |  melon
		 *         7  |  7  |  7
		 */
		String[] items= {"cherry", "apple", "banana", "melon", "7"};
		//랜덤한 숫자를 얻어내기 위한 객체
		Random ran=new Random();
		//정수 3개를 저장할 배열 미리 준비하기
		int[] nums=new int[3];
		//3회 반복하면서
		for(int i=0; i<3; i++) {
			// 0~4 사이의 랜덤한 숫자를 하나 얻어내서
			int ranNum=ran.nextInt(5);
			//얻어낸 숫자의 배열의 i번째 방에 저장하기
			nums[i]=ranNum;
			// 배열의 인덱스로 활용해서 문자열 출력하기
			System.out.print(items[ranNum]);
			if(i<2) {
				System.out.print(" | ");
			}
		}
		
		System.out.println(); //개행기호만 출력
		
		// 만일 랜덤한 숫자가 모두 같으면
		if(nums[0] == nums[1] && nums[1] == nums[2]) {
			System.out.println("당첨됐습니다!");
		}else {
			System.out.println("꽝");
		}
	}
}
