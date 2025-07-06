package com.multithreading;

public class MyRunnable extends Thread {

	public static void main(String[] args) {

		MyRunnable t = new MyRunnable();
		t.start();
		try {
			t.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	    System.out.println("Main thread resumes");	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread running : " + i);
			try {
				Thread.sleep(1200);
			} catch (Exception e) {

			}
		}

	}

}
