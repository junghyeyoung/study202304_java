package test.mypac;

public class Square {
	public int width;
	public int height;

	public void showPixel() {
		//면적 계산하기
		int area=this.width*this.height;
		//콘솔창에 면적 출력하기
		// System.out.println("사각형의 넓이:"+ area);
		System.out.println("사각형의 넓이는 "+this.width * this.height+"px 입니다.");
	}
}