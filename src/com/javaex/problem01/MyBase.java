package com.javaex.problem01;

public class MyBase extends Base{

	@Override
	public void service(String state) {
	if(state.equals("낮")) {
		this.day();
	}else if(state.equals("밤")) {
		this.night();
	}else {
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
	}
	}

   
    
}
