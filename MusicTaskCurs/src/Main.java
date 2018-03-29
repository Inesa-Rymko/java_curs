import java.util.ArrayList;
import java.util.List;

import Builder.ManagerBuilder;
import Composition.Gener;
import Composition.Music;
import Composition.MusicalSound;

public class Main {

	public static void main(String[] args) {

		Music classicMusic = ManagerBuilder.getMusic("1", "A", "Dima",
				Gener.CLASSIC, 1);
		Music hipHopMusic = ManagerBuilder.getMusic("4", "B", "Masha",
				Gener.HIPHOP, 2);
		Music rockMusic = ManagerBuilder.getMusic("3", "C", "Oleg", Gener.ROCK,
				3);
		Music popMusic = ManagerBuilder.getMusic("2", "D", "Misha", Gener.POP,
				4);
		
		List<MusicalSound> music = new ArrayList<MusicalSound>();

		music.add(classicMusic);
		music.add(hipHopMusic);
		music.add(rockMusic);
		music.add(popMusic);
		
	
		System.out.println(Worker.searchMusicForDuration(music, 1));

		for (MusicalSound playmusic : music) {
			System.out.println(playmusic);
		}
	};
}