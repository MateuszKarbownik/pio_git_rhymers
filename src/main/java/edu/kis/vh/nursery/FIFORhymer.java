package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

    public final defaultCountingOutRhymer defaultRhymer = new defaultCountingOutRhymer();

    // TODO: change name of field above

    @Override
    public int countOut() {
        while (!callCheck())
            defaultRhymer.countIn(super.countOut());

        int ret = defaultRhymer.countOut();

        while (!defaultRhymer.callCheck())
            countIn(defaultRhymer.countOut());

        return ret;
    }
}
