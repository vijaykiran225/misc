package com.vijay.javatest;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {

    private static final IntFunction<IntPredicate> greaterThan = number -> x -> x > number;
    private static final IntFunction<IntPredicate> lesserThan = number -> greaterThan.apply(number).negate();
    private static final IntFunction<IntPredicate> divisibleBy = number -> x -> x % number == 0;
    private static final IntFunction<IntUnaryOperator> multiplyBy = number -> x -> x * number;
    private static final Function<String, IntConsumer> printWithPrefix = text -> (x) -> System.out.println(text + ":" + x);


    public static void main(String[] args) {
        // write your code here

        Set<Processor> ddd=new HashSet<>();

        List<Processor> x = new Random().ints(100, 0, 200)
                .mapToObj(Processor::new)
                .peek(System.out::println)
                .collect(Collectors.toList());



        System.out.println("collectied .. now printing");
        x.stream().forEach(System.out::println);
    }

    private static void intRelatedTests() {

        new Random().ints(100,0,100)
                .peek(printWithPrefix.apply("value"))
                .filter(greaterThan.apply(10).and(lesserThan.apply(40)))
                .peek(printWithPrefix.apply("Found match"))
                .map(multiplyBy.apply(3))
                .filter(divisibleBy.apply(2))
                .forEach(printWithPrefix.apply("result is"));
    }
}
