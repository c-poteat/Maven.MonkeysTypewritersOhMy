package io.zipcoder;

import java.util.Arrays;
import java.util.Iterator;

/**
 * We're using this as an abstract base class since both the safe and unsafe copiers will implement it.
 */
public abstract class Copier implements Runnable {
    // We use an iterator so each monkey / thread can copy an individual word.
    public Iterator<String> stringIterator;
    public String copied;

    public Copier(String toCopy) {
        // Take the input string, split it on spaces, turn that array to an arraylist, and then grab its iterator.
        this.stringIterator = Arrays.asList(toCopy.split(" ")).iterator();
        this.copied = "";
    }

    public abstract void run();
    
}


//        Extend Copier in UnsafeCopier. Then, write a run method that will have the monkey grab the next
//        word and append it to the copy.
//
//        Modify MonkeyTypewriter to create 5 monkeys (threads) using the UnsafeCopier and start them.
//
//        After the sleep, print out the results of the unsafely copied passage.