package com.curs.java.console;
import java.util.List;

import com.curs.java.menu.MenuItem;
import com.curs.java.model.Entity;

public class PrinterPrint {
	public static void show(String message) {
		System.out.println(message);
	}

	public static void show(List<String> list) {
		for (String string : list) {
			show(string);
		}
	}

	public static void showMenu(List<MenuItem> items) {
		for (int i = 0; i < items.size(); i++) {
			show((i) + ". " + items.get(i).getTitle());
		}

	}

	public static void showList(List<? extends Entity> array) {
		for (int i = 0; i < array.size(); i++) {
			show((i + 1) + "." + array.get(i).toString());
		}
	

}
}
