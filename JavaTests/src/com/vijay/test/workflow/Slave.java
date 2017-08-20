package com.vijay.test.workflow;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by Vijay kiran on 020 20-Aug-2017.
 */
public class Slave {

    public static void main(String[] a){
        IntStream.range(1,10)
                .forEach(originalValue -> {
                    IntStream.range(originalValue*1000,originalValue*1000+10)
                            .forEach(updatedValue-> System.out.println(
                                    "test"+updatedValue+"("+originalValue +","+updatedValue+", e-> e*"+ new Random().nextInt(10)+"),"));
                });

    }
}
