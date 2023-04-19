package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

    public static void main(String[] args) {
        Rhymersfactory rhymersfactory = new DefaultRhymersFactory();

        DefaultCountingOutRhymer[] defaultCountingRhymer = {rhymersfactory.GetStandardRhymer(), rhymersfactory.GetFalseRhymer(),
                rhymersfactory.GetFIFORhymer(), rhymersfactory.GetHanoiRhymer()};

        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                defaultCountingRhymer[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++)
            defaultCountingRhymer[3].countIn(rn.nextInt(20));

        for (int i = 0; i < defaultCountingRhymer.length; i++) {
            while (!defaultCountingRhymer[i].callCheck())
                System.out.print(defaultCountingRhymer[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) defaultCountingRhymer[3]).reportRejected());

    }

}