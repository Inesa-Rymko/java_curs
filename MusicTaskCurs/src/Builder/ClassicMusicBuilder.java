package Builder;

import Composition.Gener;
import Composition.Music;
import Interface.IBuilder;

public class ClassicMusicBuilder implements IBuilder {

	public Music getMusic(String tembre, String title, String author,
			double duration) {
		Music music = new Music(tembre, title, author, Gener.CLASSIC, duration);
		return music;
	}

}