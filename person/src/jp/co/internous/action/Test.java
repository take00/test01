package jp.co.internous.action;

public class Test {
	public static void main(String[] args){
		Person taro =new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="0123-444-555";
		taro.address="abc@def.co.jp";

		//演習②
		Person jiro =new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		Person yuma =new Person();
		yuma.name="武優真";
		yuma.age=26;

		//演習⑧
		Robot aibo =new Robot();
		aibo.name="aibo";
		Robot asimo =new Robot();
		asimo.name="asimo";
		Robot pepper =new Robot();
		pepper.name="pepper";

		System.out.println(taro.name);
		System.out.println(taro.age);
		taro.talk();
		taro.walk();
		taro.run();
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(yuma.name);
		System.out.println(yuma.age);

		aibo.talk();
		asimo.talk();
		pepper.talk();
		asimo.run();
		pepper.walk();
	}

}
