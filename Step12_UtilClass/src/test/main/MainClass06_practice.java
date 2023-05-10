package test.main;

import java.util.HashMap;

import test.mypac.Member;

public class MainClass06_practice {
	public static void main(String[] args) {
		HashMap<String, Object> hash1=new HashMap<>();
		hash1.put("num", 10);
		hash1.put("name", "원숭이");
		hash1.put("isGirl", false);
		hash1.put("apple",new Member(0, "사과", null));
		
		int num = (int)hash1.get("num");
		String name = (String)hash1.get("name");
		boolean isGirl = (boolean)hash1.get("isGirl");
		Member apple = (Member)hash1.get("apple");
		
		hash1.put("name", "에이콘");
		hash1.remove("isGirl");
		hash1.clear();
	}
}
