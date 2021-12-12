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
        Thread unsafeMonkey1 = new Thread(reallyUnsafe);
        System.out.println("Starting threads");
        unsafeMonkey1.start();
        Thread unsafeMonkey2 = new Thread(reallyUnsafe);
        unsafeMonkey2.start();
        Thread unsafeMonkey3 = new Thread(reallyUnsafe);
        unsafeMonkey3.start();
        Thread unsafeMonkey4 = new Thread(reallyUnsafe);
        unsafeMonkey4.start();
        Thread unsafeMonkey5 = new Thread(reallyUnsafe);
        unsafeMonkey5.start();

        SafeCopier safeCopier = new SafeCopier(introduction);
        Thread safeMonkey1 = new Thread(safeCopier);
        safeMonkey1.start();  // Runs entire code

        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println("MAIN INTERRUPTED");
        }
        // Print out the copied versions here.
        //After the sleep, print out the results of the unsafely copied passage.
//        System.out.println(reallyUnsafe.copied);
        System.out.println(safeCopier.copied);
        System.out.println(reallyUnsafe.copied);

    }
}

