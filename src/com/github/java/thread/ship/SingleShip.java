package com.github.java.thread.ship;

public class SingleShip implements Runnable {
	private int countBox;
	private int timeLoadOneBox;

	public SingleShip(int countBox, int timeLoadOneBox) {
		super();
		this.countBox = countBox;
		this.timeLoadOneBox = timeLoadOneBox;
	}

	public int getCountBox() {
		return countBox;
	}

	public void setCountBox(int countBox) {
		this.countBox = countBox;
	}

	public int getTimeLoad() {
		return timeLoadOneBox;
	}

	public void setTimeLoad(int timeLoadOneBox) {
		this.timeLoadOneBox = timeLoadOneBox;
	}

	@Override
	public void run() {
		for (int i = 1; i < countBox + 1; i++) {
			System.out.println(Thread.currentThread().getName() + "	" + i);
			try {
				Thread.sleep(timeLoadOneBox);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		
		}
	}
}
