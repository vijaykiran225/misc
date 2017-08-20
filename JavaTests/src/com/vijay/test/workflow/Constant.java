package com.vijay.test.workflow;

import java.util.Collections;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.stream.Stream;

/**
 * Created by Vijay kiran on 020 20-Aug-2017.
 */
public enum Constant {

    test1000(1, 1000, e -> e * 3,"v1"),
    test1001(1, 1001, e -> e * 9,"v1"),
    test1002(1, 1002, e -> e * 4,"v1"),
    test1003(1, 1003, e -> e * 110,"v1"),
    test1004(1, 1004, e -> e * 8,"v1"),
    test1005(1, 1005, e -> e * 11,"v1"),
    test1006(1, 1006, e -> e * 4,"v1"),
    test1007(1, 1007, e -> e * 5,"v1"),
    test1008(1, 1008, e -> e * 11,"v1"),
    test1009(1, 1009, e -> e * 8,"v1"),
    test2000(2, 2000, e -> e * 9,"v1"),
    test2001(2, 2001, e -> e * 8,"v1"),
    test2002(2, 2002, e -> e * 11,"v1"),
    test2003(2, 2003, e -> e * 11,"v1"),
    test2004(2, 2004, e -> e * 7,"v1"),
    test2005(2, 2005, e -> e * 9,"v1"),
    test2006(2, 2006, e -> e * 4,"v1"),
    test2007(2, 2007, e -> e * 110,"v1"),
    test2008(2, 2008, e -> e * 110,"v1"),
    test2009(2, 2009, e -> e * 3,"v1"),
    test3000(3, 3000, e -> e * 6,"v1"),
    test3001(3, 3001, e -> e * 4,"v1"),
    test3002(3, 3002, e -> e * 11,"v1"),
    test3003(3, 3003, e -> e * 2,"v1"),
    test3004(3, 3004, e -> e * 9,"v1"),
    test3005(3, 3005, e -> e * 8,"v1"),
    test3006(3, 3006, e -> e * 8,"v1"),
    test3007(3, 3007, e -> e * 6,"v1"),
    test3008(3, 3008, e -> e * 110,"v1"),
    test3009(3, 3009, e -> e * 8,"v1"),
    test4000(4, 4000, e -> e * 3,"v1"),
    test4004(4, 4004, e -> e * 2,"v5"),
    test4006(4, 4006, e -> e * 110,"v1"),
    test4009(4, 4009, e -> e * 7,"v1"),
    test4007(4, 4007, e -> e * 5,"v5"),


    test4001(4, 4001, e -> e * 4,"v3"),
    test4002(4, 4002, e -> e * 2,"v1"),
    test4003(4, 4003, e -> e * 1,"v2"),
    test4005(4, 4005, e -> e * 11,"v4"),
    test4008(4, 4008, e -> e * 9,"v5"),


    test5000(5, 5000, e -> e * 6,"v1"),
    test5001(5, 5001, e -> e * 8,"v1"),
    test5002(5, 5002, e -> e * 2,"v1"),
    test5003(5, 5003, e -> e * 3,"v1"),
    test5004(5, 5004, e -> e * 11,"v1"),
    test5005(5, 5005, e -> e * 2,"v1"),
    test5006(5, 5006, e -> e * 2,"v1"),
    test5007(5, 5007, e -> e * 4,"v1"),
    test5008(5, 5008, e -> e * 11,"v1"),
    test5009(5, 5009, e -> e * 2,"v1"),
    test6000(6, 6000, e -> e * 11,"v1"),
    test6001(6, 6001, e -> e * 3,"v1"),
    test6002(6, 6002, e -> e * 11,"v1"),
    test6003(6, 6003, e -> e * 4,"v1"),
    test6004(6, 6004, e -> e * 5,"v1"),
    test6005(6, 6005, e -> e * 5,"v1"),
    test6006(6, 6006, e -> e * 3,"v1"),
    test6007(6, 6007, e -> e * 5,"v1"),
    test6008(6, 6008, e -> e * 11,"v1"),
    test6009(6, 6009, e -> e * 7,"v1"),
    test7000(7, 7000, e -> e * 2,"v1"),
    test7001(7, 7001, e -> e * 11,"v1"),
    test7002(7, 7002, e -> e * 6,"v1"),
    test7003(7, 7003, e -> e * 8,"v1"),
    test7004(7, 7004, e -> e * 6,"v1"),
    test7005(7, 7005, e -> e * 5,"v1"),
    test7006(7, 7006, e -> e * 2,"v1"),
    test7007(7, 7007, e -> e * 4,"v1"),
    test7008(7, 7008, e -> e * 8,"v1"),
    test7009(7, 7009, e -> e * 6,"v1"),
    test8000(8, 8000, e -> e * 9,"v1"),
    test8001(8, 8001, e -> e * 8,"v1"),
    test8002(8, 8002, e -> e * 4,"v1"),
    test8003(8, 8003, e -> e * 9,"v1"),
    test8004(8, 8004, e -> e * 9,"v1"),
    test8005(8, 8005, e -> e * 7,"v1"),
    test8006(8, 8006, e -> e * 6,"v1"),
    test8007(8, 8007, e -> e * 2,"v1"),
    test8008(8, 8008, e -> e * 4,"v1"),
    test8009(8, 8009, e -> e * 2,"v1"),
    test9000(9, 9000, e -> e * 3,"v1"),
    test9001(9, 9001, e -> e * 8,"v1"),
    test9002(9, 9002, e -> e * 11,"v1"),
    test9003(9, 9003, e -> e * 5,"v1"),
    test9004(9, 9004, e -> e * 6,"v1"),
    test9005(9, 9005, e -> e * 2,"v1"),
    test9006(9, 9006, e -> e * 8,"v1"),
    test9007(9, 9007, e -> e * 9,"v1"),
    test9008(9, 9008, e -> e * 5,"v1"),
    test9009(9, 9009, e -> e * 2,"v1"),
    IDENTITY_NO_OPERATION(0,0,e->0 ,"v8");

    private Constant(int workflow, int fieldId, IntUnaryOperator operation,String target) {
        this.fieldId = fieldId;
        this.workflow = workflow;
        this.operation = operation;
        this.targetKey=target;
    }

    public static Holder getConstant(final Holder data) {

        Constant constant = Stream.of(Constant.values())
                .filter(e -> e.fieldId == data.getField())
                .filter(e -> e.workflow == data.getWorkflow())
                .findAny()
                .orElseGet(() -> Constant.IDENTITY_NO_OPERATION);

        return new Holder(constant.getOperation().applyAsInt(data.getFieldValue())
                ,constant.getTargetKey());
    }

    private int workflow;
    private int fieldId;
    private IntUnaryOperator operation;
    private String targetKey;

    public IntUnaryOperator getOperation() {
        return operation;
    }
    public String getTargetKey(){
        return this.targetKey;
    }
}
