package io.zipcoder;

import java.util.Arrays;

public class MonkeyTypewriter {
    public static void main(String[] args) {
        String introduction = "It was the best of times,\n" +
                "it was the blurst of times,\n" +
                "it was the age of wisdom,\n" +
                "it was the age of foolishness,\n" +
                "it was the epoch of belief,\n" +
                "it was the epoch of incredulity,\n" +
                "it was the season of Light,\n" +
                "it was the season of Darkness,\n" +
                "it was the spring of hope,\n" +
                "it was the winter of despair,\n" +
                "we had everything before us,\n" +
                "we had nothing before us,\n" +
                "we were all going direct to Heaven,\n" +
                "we were all going direct the other way--\n" +
                "in short, the period was so far like the present period, that some of\n" +
                "its noisiest authorities insisted on its being received, for good or for\n" +
                "evil, in the superlative degree of comparison only.";

        UnsafeCopier reallyUnsafe = new UnsafeCopier(introduction);
        // Setup thread
        Thread monkey1 = new Thread(reallyUnsafe);
        System.out.println("Starting threads");
        monkey1.start();
        Thread monkey2 = new Thread(reallyUnsafe);
        monkey2.start();
        Thread monkey3 = new Thread(reallyUnsafe);
        monkey3.start();
        Thread monkey4 = new Thread(reallyUnsafe);
        monkey4.start();
        Thread monkey5 = new Thread(reallyUnsafe);
        monkey5.start();


        SafeCopier safeCopier = new SafeCopier(introduction);
        Thread monkey6 = new Thread(safeCopier);
        monkey6.start();
        Thread monkey7 = new Thread(safeCopier);
        monkey7.start();
        Thread monkey8 = new Thread(safeCopier);
        monkey8.start();
        Thread monkey9 = new Thread(safeCopier);
        monkey9.start();
        Thread monkey10 = new Thread(safeCopier);
        monkey10.start();

        // Modify MonkeyTypewriter to create 5 monkeys (threads) using the UnsafeCopier and start them.
        // Do all of the Monkey / Thread building here
        // For each Copier(one safe and one unsafe), create and start 5 monkeys copying the introduction to
        // A Tale Of Two Cities.
        // This wait is here because main is still a thread and we want the main method to print the finished copies
        // after enough time has passed.
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println("MAIN INTERRUPTED");
        }
        // Print out the copied versions here.
        //After the sleep, print out the results of the unsafely copied passage.
        System.out.println(reallyUnsafe.copied);
        System.out.println(safeCopier.copied);

    }
}

