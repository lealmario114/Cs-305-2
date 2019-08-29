package edu.siu.cs305;

public class Demo {

	public static void main(String[] args) {

		
		Student demo = new Student();
		
		demo.setBirthMonth(8);
		demo.setBirthDate(11);
		demo.setBirthYear(1996);
		demo.setName("Modock");
		
		
		
		System.out.println(demo.toString());
		System.out.println(demo.getBirthDate());
		System.out.println(demo.getBirthMonth());
		System.out.println(demo.getDOB());
		System.out.println(demo.getName());

	}

}
