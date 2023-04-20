package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int ARRAY_CAPACITY = 12;
    public static final int TOTAL_NOT_CHANGED = -1;
    public static final int ERROR_NUMBER = -1;
    public static final int TOTAL_START_VALUE = -1;
    private final int[] NUMBERS = new int[ARRAY_CAPACITY];

    public int total = TOTAL_START_VALUE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL_NOT_CHANGED;
    }

    public boolean isFull() {
        return total == ARRAY_CAPACITY - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_NUMBER;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_NUMBER;
        return NUMBERS[total--];
    }

}
