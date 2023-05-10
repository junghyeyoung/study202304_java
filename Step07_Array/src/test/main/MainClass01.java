package test.main;
/*
 *  java 에서 배열도 객체이다.
 *  즉, 배열은 참조데이터 type 이다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		// int type 5개를 저장하고 있는 배열 객체 생성해서 참조값을 nums 라는 지역 변수에 담기
		int[] nums = {10, 20, 30, 40, 50};  //null : 참조데이터 타입이 담길 수 있는 빈 공간 . int 배열의 참조값만 들어갈 수 있다.
		// double type 5개를 저장하고 있는 배열
		double[] nums2= {10.1, 10.2, 10.3, 10.4, 10.5};
		// boolean type 5개를 저장하고 있는 배열
		boolean[] truth= {true, false, false, true, true};
		// String type (참조데이터 type) 5개를 저장하고 있는 배열
		String[] names= {"김구라", "해골", "원숭이", "주뎅이", "덩어리"}; //총 9개의 아이디 생성
		
		// 배열객체는 clone() 이라는 메소드와 length 라는 필드가 있다.
		int[] result=nums.clone();
		int[] result2=nums; //참조값 복사
		// 배열의 크기 얻어내기
		int size=nums.length;
		// 배열은 순서가 있는 데이터이다. 특정 index 의 item 참조하는 방법
		int first=nums[0];
		int second=nums[1];
		int third=nums[2];
	}
}
