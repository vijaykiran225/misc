package com.vijay.test.workflow;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * Created by Vijay kiran on 020 20-Aug-2017.
 */
public class DataCollector implements Collector<Holder,ActualDataBuilder,ActualData>{

    @Override
    public Supplier<ActualDataBuilder> supplier() {
        return ActualDataBuilder::getNewInstance;
    }

    @Override
    public BiConsumer<ActualDataBuilder, Holder> accumulator() {
        return (builder , data) ->builder.with(data);
    }

    @Override
    public BinaryOperator<ActualDataBuilder> combiner() {
        return (actualDataBuilder, actualDataBuilder2) -> actualDataBuilder.combineWith(actualDataBuilder2);
    }

    @Override
    public Function<ActualDataBuilder, ActualData> finisher() {
        return e-> e.build();
    }

    @Override
    public Set<Characteristics> characteristics() {
        Set<Characteristics> c_set= new HashSet<Characteristics>();
        c_set.add(Characteristics.UNORDERED);
        return c_set;

    }
}
