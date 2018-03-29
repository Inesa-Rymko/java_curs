package Composition;

public class MusicalSound {

	private String tembre;

	public MusicalSound(String tembre) {
		super();
		this.tembre = tembre;
	}

	public MusicalSound() {
		super();
	}

	public String getTembre() {
		return tembre;
	}

	public void setTembre(String tembre) {
		this.tembre = tembre;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(" MusicalSound [tembre=" + tembre + "]");
		return stringBuilder.toString();
	}

}
