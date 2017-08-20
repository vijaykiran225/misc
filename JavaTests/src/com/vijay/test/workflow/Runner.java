package com.vijay.test.workflow;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) throws Exception{


        Holder[] data={new Holder(4,4002,56788),
                new Holder(4,4003,12),
                new Holder(4,4001,33),
                new Holder(4,4005,100),
                new Holder(4,5007,1900),
                new Holder(4,4008,678)};

        ActualData x = Arrays.stream(data)
                .map(Constant::getConstant)
                .collect(new MyCollector());
        System.out.print(x);
    }
}
