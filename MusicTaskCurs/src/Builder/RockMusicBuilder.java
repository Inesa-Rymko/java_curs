package Builder;

import Composition.Gener;
import Composition.Music;
import Interface.IBuilder;

public class RockMusicBuilder implements IBuilder {
		
		@Override
		public Music getMusic(String tembre,String title, String author, double duration) {
			Music music = new Music(tembre,title, author, Gener.ROCK, duration);
			return music;
		}
}
