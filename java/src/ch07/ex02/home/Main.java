package ch07.ex02.home;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Pencil pen = new Pencil();
		Eraser eraser = new Eraser();
		
		List<Stationery> backpack = new ArrayList<>();
		backpack.add(pen);
		backpack.add(eraser);
		for(Stationery stationery: backpack) {
			stationery.write();
			stationery.eraser();
		}
	}
}
