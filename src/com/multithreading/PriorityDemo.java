package com.multithreading;

class PriorityDemo extends Thread {
	public void run() {
		System.out.println(
				Thread.currentThread().getName() + " is running with priority : " + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		PriorityDemo t1 = new PriorityDemo();
		PriorityDemo t2 = new PriorityDemo();

		t1.setPriority(Thread.MIN_PRIORITY); // 1
		t2.setPriority(Thread.MAX_PRIORITY); // 10

		t1.setName("LowPriorityThread");
		t2.setName("HighPriorityThread  : ");

		t1.start();
		t2.start();
	}
}
