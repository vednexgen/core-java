package org.nexgen.multithreading;

class SharedResource {
    private int data;
    private boolean available = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (available) {
            wait();
        }
        data = value;
        available = true;
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (!available) {
            wait();
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify();
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try { resource.produce(i); Thread.sleep(500);} catch (Exception e) {}
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try { resource.consume(); Thread.sleep(500);} catch (Exception e) {}
            }
        });

        producer.start();
        consumer.start();
    }
}