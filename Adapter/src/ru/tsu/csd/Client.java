package ru.tsu.csd;

public class Client {
	public static void main(String[] args) {
		Writer w = new ShuffleAdapter();
		w.write();		
	}
}
