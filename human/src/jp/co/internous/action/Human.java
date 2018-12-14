package jp.co.internous.action;

public class Human {

	public static void main(String[] args){

		HumanName abc=new HumanName();
		System.out.println(abc.getName());

		HumanAge def=new HumanAge();
		System.out.println(def.getAge());

		HumanAddress hij=new HumanAddress();
		System.out.println(hij.getAddress());
	}
}
