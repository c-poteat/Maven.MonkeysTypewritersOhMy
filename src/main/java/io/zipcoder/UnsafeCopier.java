package io.zipcoder;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {

    public UnsafeCopier(String toCopy) {
        super(toCopy);
    }

    public void run() {
        while (stringIterator.hasNext()) {
            copied = copied + stringIterator.hasNext();
            copied = copied + " ";
        }
        // Write a run method that will have the monkey grab the next word and append it to the copy.

    }
}
