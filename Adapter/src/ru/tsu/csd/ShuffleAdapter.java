package ru.tsu.csd;

import library.ShuffleWriter;

public class ShuffleAdapter extends ShuffleWriter implements Writer {
	@Override
	public void write() {
		writeShuffle();
	}
}
