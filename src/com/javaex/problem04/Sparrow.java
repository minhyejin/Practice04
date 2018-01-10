package com.javaex.problem04;

public class Sparrow extends Bird {

	@Override
	public void sing() {
		System.out.println("참새("+getName()+")소리내어 웁니다.");
	}

	@Override
	public void fly() {
		System.out.println("참새("+getName()+")가 날아다닙니다");
	}

	@Override
	public void showName() {
		System.out.println("참새("+getName()+")의 이름은 짹짹이 입니다.");
	}


	

}
