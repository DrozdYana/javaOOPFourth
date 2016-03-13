package com.github.java.thread.sort;



public class SingleThreadSorting implements Runnable {
	private int[] array;
	private int begin;
	private int end;
	private Thread thr;

	public SingleThreadSorting(int[] array, int begin, int end) {
		super();
		this.array = array;
		this.begin = begin;
		this.end = end;
		thr = new Thread(this);
		thr.start();
	}

	public Thread getThr() {
		return thr;
	}

	private synchronized int[] sort() {
		int temp;
		for (int i = begin; i < end; i++) {
			int k = i - 1;
			temp = array[i];
			for (; k >= 0 && array[k] > temp;) {
				array[k + 1] = array[k];
				array[k] = temp;
				k--;
			}
		}
		//System.out.println(Thread.currentThread().getName() + "     " + "Array" + Arrays.toString(array));
		return array;
	}

	@Override
	public void run() {
		sort();
	}

}
