package com.javaex.problem03;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        if(str.equals("앱")) {
        	this.playApp();
        }else if(str.equals("음악")) {
        	this.playMusic();
        }else if(str.equals("통화")) {
        	super.execute(str);
        }
       
        
    }

	private void playApp() {
    	System.out.println("앱실행");
    }
 
  
    
    
    
}
