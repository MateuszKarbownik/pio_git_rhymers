package edu.kis.vh.nursery;

/**
 * Represents a default counting out rhymer.
 */
public class defaultCountingOutRhymer {

    public static final int ARRAY_CAPACITY = 12;
    public static final int TOTAL_NOT_CHANGED = -1;
    public static final int ERROR_NUMBER = -1;
    public static final int TOTAL_START_VALUE = -1;
    private final int[] NUMBERS = new int[ARRAY_CAPACITY];

    public int total = TOTAL_START_VALUE;

    /**
     * Adds a number to the counting out rhymer.
     *
     * @param in The number to be counted in.
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    /**
     * Checks if the counting out rhymer is empty.
     *
     * @return {@code true} if the counting out rhymer is empty, {@code false} otherwise.
     */
    public boolean callCheck() {
        return total == TOTAL_NOT_CHANGED;
    }

    /**
     * Checks if the counting out rhymer is full.
     *
     * @return {@code true} if the counting out rhymer is full, {@code false} otherwise.
     */
    public boolean isFull() {
        return total == ARRAY_CAPACITY - 1;
    }

    /**
     * Retrieves the top element of the counting out rhymer without removing it.
     *
     * @return The top element of the counting out rhymer, or {@code -1} if the rhymer is empty.
     */
    protected int peekaboo() {
        if (callCheck())
            return ERROR_NUMBER;
        return NUMBERS[total];
    }

    /**
     * Retrieves and removes the top element from the counting out rhymer.
     *
     * @return The top element of the counting out rhymer, or {@code -1} if the rhymer is empty.
     */
    public int countOut() {
        if (callCheck())
            return ERROR_NUMBER;
        return NUMBERS[total--];
    }

    /**
     * Retrieves the total number of elements in the counting out rhymer.
     *
     * @return The total number of elements in the counting out rhymer.
     */
    public int getTotal() {
        return total;
    }
}
