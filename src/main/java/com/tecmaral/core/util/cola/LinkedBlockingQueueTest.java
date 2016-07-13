package com.tecmaral.core.util.cola;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueTest {
    //LinkedBlockingQueue object created with size 1
    private static LinkedBlockingQueue<String> lbq = new LinkedBlockingQueue<String>(1);
	
    //Producer class that will item in LinkedBlockingQueue object
    class Producer implements Runnable {
    
    	
        public void run() {
            try {
                int i=1;
                while(i<=5){
                    //add item
                  lbq.put("A"+i);
                  System.out.println("A"+i+" added.");
                  i++;
                  Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
 
    //Consumer class that will consume or remove item from LinkedBlockingQueue object
    class Consumer implements Runnable {
        
        public void run() {
            try {
                int i=1;
                while(i<=5){
                    //removes the item
                    String s=lbq.take();
                    System.out.println(s+" removed.");
                    i++;
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //main method to start thread
    public static void main(String... args) {
        new Thread(new LinkedBlockingQueueTest().new Producer()).start();
        new Thread(new LinkedBlockingQueueTest().new Consumer()).start();
    }
}