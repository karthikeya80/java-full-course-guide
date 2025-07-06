package com.multithreading;

public class MyThread {

	public static void main(String[] args) {
		Thread t = new Thread(() -> {});
		t.setName("MyThread");
		System.out.println(t.getName() + " : "+ t);  // MyThread

	}
}
//MyThread : Thread[MyThread,5,main]
// wt is 5 