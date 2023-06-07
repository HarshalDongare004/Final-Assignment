import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumer {

    private static final int QUEUE_SIZE = 10;
    private static final Lock queueLock = new ReentrantLock();
    private static final Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        // Create the producer and consumer threads.
        Thread producerThread = new Thread(new Producer());
        Thread consumerThread = new Thread(new Consumer());

        // Start the threads.
        producerThread.start();
        consumerThread.start();

        // Wait for the threads to finish.
        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the sum of the numbers produced by the producer.
        System.out.println("The sum of the numbers is: " + Consumer.sum);
    }

    static class Producer implements Runnable {

        @Override
        public void run() {
            // Generate random numbers and add them to the queue.
            while (true) {
                int number = (int) (Math.random() * 100);
                queueLock.lock();
                try {
                    while (queue.size() == QUEUE_SIZE) {
//                        queueLock.unlock();
                        queueLock.lock();
                    }
                    queue.add(number);
                } finally {
                    queueLock.unlock();
                }
            }
        }
    }

    static class Consumer implements Runnable {

        static int sum = 0;

        @Override
        public void run() {
            // Read numbers from the queue and calculate their sum.
            while (true) {
                queueLock.lock();
                try {
                    while (queue.isEmpty()) {
                        queueLock.unlock();
                        queueLock.lock();
                    }
                    int number = queue.remove();
                    sum += number;
                } finally {
                    queueLock.unlock();
                }
            }
        }
    }
}