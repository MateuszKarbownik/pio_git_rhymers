package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer defaultCountingRhymer = new DefaultCountingOutRhymer();
        int testValue = 4;
        defaultCountingRhymer.countIn(testValue);

        int result = defaultCountingRhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer defaultCountingRhymer = new DefaultCountingOutRhymer();
        boolean result = defaultCountingRhymer.callCheck();
        Assert.assertEquals(true, result);

        defaultCountingRhymer.countIn(888);

        result = defaultCountingRhymer.callCheck();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer defaultCountingRhymer = new DefaultCountingOutRhymer();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = defaultCountingRhymer.isFull();
            Assert.assertEquals(false, result);
            defaultCountingRhymer.countIn(888);
        }

        boolean result = defaultCountingRhymer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPeekaboo() {
        DefaultCountingOutRhymer defaultCountingRhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = defaultCountingRhymer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        defaultCountingRhymer.countIn(testValue);

        result = defaultCountingRhymer.peekaboo();
        Assert.assertEquals(testValue, result);
        result = defaultCountingRhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer defaultCountingRhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = defaultCountingRhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        defaultCountingRhymer.countIn(testValue);

        result = defaultCountingRhymer.countOut();
        Assert.assertEquals(testValue, result);
        result = defaultCountingRhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}
