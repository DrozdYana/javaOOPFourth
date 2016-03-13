package com.github.java.thread.ship;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainDok {

	public static void main(String[] args) {
		ExecutorService ex=Executors.newFixedThreadPool(2);
		ex.execute(new SingleShip(10,500));
		ex.execute(new SingleShip(10,500));
		ex.execute(new SingleShip(10,500));
		
		ex.shutdown();
	}

}
