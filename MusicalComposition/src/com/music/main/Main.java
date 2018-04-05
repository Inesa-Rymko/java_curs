package com.music.main;

import com.music.composition.ClassicMusic;
import com.music.composition.PopMusic;
import com.music.composition.RockMusic;
import com.music.disk.DiskManager;

public class Main {
	public static void main(String[] args) {
	
		DiskManager dm =new DiskManager();
		
	ClassicMusic cl = new ClassicMusic("Pet", "Beliver", 2.5);
	ClassicMusic cl1 = new ClassicMusic("Petr", "I Beliver", 2.8);
	PopMusic pm = new PopMusic("Oleg", "Life", 2.5);
	RockMusic rm = new RockMusic("Pet", "Beliver", 2.5);
    RockMusic rm1 = new RockMusic("Pet", "Beliver", 2.5);
    
    
    dm.addMusic(rm1);
    dm.addMusic(rm);
    dm.addMusic(pm);
    dm.addMusic(cl1);
    dm.addMusic(cl);
    dm.getDurationMusic();
    
    

}
	}

