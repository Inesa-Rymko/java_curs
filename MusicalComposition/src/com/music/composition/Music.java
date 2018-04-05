package com.music.composition;

public abstract class Music {
	public String author;
	public String gener;
	public double duration;

	public Music(String author, String gener,
			double duration) {
		this.author = author;
		this.gener = gener;
		this.duration = duration;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGener() {
		return gener;
	}

	public void setGener(String gener) {
		this.gener = gener;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}
}
