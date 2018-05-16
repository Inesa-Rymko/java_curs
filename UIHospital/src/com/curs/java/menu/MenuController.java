package com.curs.java.menu;

import com.curs.java.console.Input;

public class MenuController {
	public static boolean isRun = true;
	private Builder builder;
	private Navigator navigator;
	
	public void run(){
		builder = new Builder();
		builder.buildMenu();
		navigator = new Navigator(builder.getRootMenu());
		while (isRun) {
			navigator.printMenu();
			int position = Input.getInstance().getInt();
			navigator.navigate(position);
		}
	}

}
