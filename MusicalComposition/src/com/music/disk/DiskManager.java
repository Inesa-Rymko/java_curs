package com.music.disk;

import com.music.composition.Music;

public class DiskManager {
	Disk disk = new Disk();

	public boolean checkArray(Music[] music) {
		for (int i = 0; i < music.length; i++) {
			if (music[i] == null) {
				return true;
			}
		}
		return false;
	}

	public Integer getNullIndex(Music[] music) {
		Integer index = null;
		for (int i = 0; i < music.length; i++) {
			if (music[i] == null) {
				index = i;
				return index;
			}
		}
		return null;
	}

	public Music[] resizeArr(Music[] music) {
		int size = music.length;
		int newSize = size * 2;
		Music[] newMusic = new Music[newSize];
		System.arraycopy(music, 0, newMusic, 0, size);
		return newMusic;
	}
	
	public void addMusic(Music music) {
		Music[] compositions = disk.getDisk();
		if (!checkArray(compositions)) {
			resizeArr(compositions);
		} else {
			Integer index = getNullIndex(compositions);
			for (int i = 0; i < compositions.length; i++) {
				compositions[index] = music;
			}
		}
		System.out.println(music);
	}

	public double getDurationMusic(Music music) {
		double duration = music.getDuration();
		return duration;
	}

	public double getDurationMusic() {
		Music[] composition = disk.getDisk();
		int duration = 0;
		for (int i = 0; i < composition.length; i++) {
			if (composition[i] != null) {
				duration += getDurationMusic(composition[i]);
			}
		}
		System.out.println(duration);
		return duration;
	}

}
