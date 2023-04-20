package edu.kis.vh.nursery;

import edu.kis.vh.nursery.defaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

    private static final String ENDING_MESSAGE = "total rejected is ";
    private static final String DOUBLE_SPACE = "  ";
    public static final int TOP_RAND_VALUE = 20;
    public static final int MAX_NUMBERS_IN_ROW = 15;
    public static final int ROWS = 3;
    public static final int ROW_NUMBER_TO_RANDOMIZE_ELEMENTS = 3;

    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();

        defaultCountingOutRhymer[] rhymers = {factory.GetStandardRhymer(), factory.GetFalseRhymer(),
                factory.GetFIFORhymer(), factory.GetHanoiRhymer()};

        for (int i = 1; i < MAX_NUMBERS_IN_ROW; i++)
            for (int j = 0; j < ROWS; j++)
                rhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < MAX_NUMBERS_IN_ROW; i++)
            rhymers[ROW_NUMBER_TO_RANDOMIZE_ELEMENTS].countIn(rn.nextInt(TOP_RAND_VALUE));

        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + DOUBLE_SPACE);
            System.out.println();
        }

        System.out.println(ENDING_MESSAGE
                + ((HanoiRhymer) rhymers[ROW_NUMBER_TO_RANDOMIZE_ELEMENTS]).reportRejected());

    }

}