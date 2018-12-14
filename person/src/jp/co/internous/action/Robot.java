package jp.co.internous.action;

public class Robot {
	public String name = null;


	public void talk(){
		System.out.println(this.name+"さん、話しましょう。");
	}
	public void walk(){
		System.out.println(this.name+"さん、歩きましょう。");
	}
	public void run(){
		System.out.println(this.name+"さん、走りましょう。");
	}
}
