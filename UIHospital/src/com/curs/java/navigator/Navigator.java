package com.curs.java.navigator;

import java.util.List;

import com.curs.java.menu.Menu;
import com.curs.java.menu.MenuItem;
import com.curs.java.utils.PrinterPrint;


public class Navigator {
	private Menu currentMenu;

	public Navigator(Menu currentMenu) {
		super();
		this.currentMenu = currentMenu;
	}

	public void printMenu() {
		PrinterPrint.showMenu(currentMenu.getListItems());
	}

	public void navigate(Integer index) {
		List<MenuItem> listItems = currentMenu.getListItems();
		MenuItem item = listItems.get(index);
		if (item.getAction() != null) {
			item.doAction();
		} else {
			currentMenu = item.getNextMenu();
		}
	}

}
