package test.main;

public class TestClass01 {
	public static void main(String[] args) {
		System.out.println("안녕하세요!");
		
		int kor=55;
		int eng=78;
		int math=67;
		int sc=25;
		
		double avg = (kor+eng+math+sc)/4d;
		System.out.println(avg);
		
		boolean isGreater=10<1;
		boolean result=true&&false;
		result=true;
		System.out.println(result);
		
		boolean isRun=true;
		if(isRun) {
			System.out.println("달려요");
		}
	}

}
