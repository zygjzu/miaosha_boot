package com.test;

public class Test {

	public static void main(String[] args) {
//		test1();
		
//		test2();
		
//		test3();
		
		test4();
	}

	private static void test4() {
		switch(1){
			case 1 :
				System.out.println("1");
//				System.out.println("111");
//				System.out.println("111");
			case 2 :
				System.out.println("2");
		}
		
	}

	private static void test3() {
		Integer a = 100;
		Integer b = 100;
		System.out.println(a==b);
		
		String c = "100";
		Long d = 100l;
		System.out.println(c.equals(d));
	}

	private static void test2() {
		try {
			int c = 5/0;
			System.out.println("try");
			return;
		} catch (Exception e) {
			
			System.out.println("catch");
			return;
		}finally {
			System.out.println("finally");
		}
	}

	private static void test1() {
		switch(1){
			case 1 :
				System.out.println("1");
			case 2 :
				System.out.println("2");
		}
	}

}
