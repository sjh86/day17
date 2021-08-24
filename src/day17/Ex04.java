package day17;

import java.util.ArrayList;
import java.util.HashMap;

class Test{
	private String test;
	private int aaa;
	
	public int getAaa() {
		return aaa;
	}
	public void setAaa(int aaa) {
		this.aaa = aaa;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getTest() {
		return test;
	}
	public void display() {
		System.out.println(test+aaa+"test 기능 입니다");
	}
}
public class Ex04 {
	public static void main(String[] args) {
		ArrayList<Test> tArr = new ArrayList<Test>();
		Test t = new Test();
		t.setTest("문자열");
		t.setAaa(123456);
		tArr.add( t );
		
		Test a = tArr.get(0);
		a.display();
		
		HashMap<String, Test> map = new HashMap<String, Test>();
		map.put("111", t);
		t = new Test();
		t.setTest("안녕하세요");
		map.put("hello", t);
		//Test tt = map.get("111");
		//tt.display();
		map.get("111").display();
		System.out.println(map.get("111").getTest());
		System.out.println(map.get("hello").getTest());
		
	}
}
