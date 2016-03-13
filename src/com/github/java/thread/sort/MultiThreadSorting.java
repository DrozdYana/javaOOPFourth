package com.github.java.thread.sort;

public class MultiThreadSorting {
	static void sort(int[] array, int threadNumber) {
		SingleThreadSorting[] threadarray = new SingleThreadSorting[threadNumber];
		for (int i = 0; i < threadarray.length; i++) {
			int size = array.length / threadNumber;
			int begin = size * i;
			int end = ((i + 1) * size);
			if ((array.length - end) <= size) {
				end = array.length;
			}
			threadarray[i] = new SingleThreadSorting(array, begin, end);
		}
		for (int i = 0; i < threadarray.length; i++) {

			try {
				threadarray[i].getThr().join();

			} catch (InterruptedException e) {
				System.out.println(e);
			}

		}
		
	}

}
