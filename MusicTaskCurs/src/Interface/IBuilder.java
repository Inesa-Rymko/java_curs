package Interface;

import Composition.Music;

public interface IBuilder {
	
	public Music getMusic(String tembre,String title, String author, double duration);
	

}
