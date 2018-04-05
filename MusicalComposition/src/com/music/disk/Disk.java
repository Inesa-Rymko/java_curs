package com.music.disk;

import com.music.composition.Music;

public class Disk {
	Music [] disk = new Music[10];

	public Music[] getDisk() {
		return disk;
	}

	public void setDisk(Music[] disk) {
		this.disk = disk;
	}

}
