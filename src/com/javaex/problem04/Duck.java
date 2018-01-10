package com.javaex.problem04;

public class Duck extends Bird {

    public void sing() {
    	System.out.println("오리 ("+getName()+") 소리내어 웁니다.");
    }

    public void fly() {
    	System.out.println("오리 ("+getName()+") 가 날지않습니다");
    }
    
    public void showName() {
    	System.out.println("오리 ("+getName()+") 의 이름은 꽥꽥이 입니다.");
    }

}
