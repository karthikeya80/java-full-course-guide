package com.multithreading;

public class MyRunnable extends Thread {

	public static void main(String[] args) {

		Thread t = new Thread();
		t.start();

	}
	public void run() {
		System.out.println("Thread running via Runnable interface");
	}

}
