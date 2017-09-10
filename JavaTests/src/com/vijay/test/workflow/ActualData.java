package com.vijay.test.workflow;

/**
 * Created by Vijay kiran on 020 20-Aug-2017.
 */

class ActualDataBuilder {
    private ActualData data=new ActualData();

    private ActualDataBuilder(){

    }

    static ActualDataBuilder getNewInstance(){
        ActualDataBuilder builder=new ActualDataBuilder();
        return builder;
    }

    private ActualDataBuilder withV1(int val1){
        this.data.setVal1(val1);
        return this;
    }
    private ActualDataBuilder withV2(int val2){
        this.data.setVal2(val2);
        return this;
    }
    private ActualDataBuilder withV3(int val3){
        this.data.setVal3(val3);
        return this;
    }
    private ActualDataBuilder withV4(int val4){
        this.data.setVal4(val4);
        return this;
    }
    private ActualDataBuilder withV5(int val5){
        this.data.setVal5(val5);
        return this;
    }
    ActualData build(){
        return this.data;
    }

    ActualDataBuilder with(Holder data) {
        if(data.getTarget().equals("v5")){
            this.withV5(data.getTransformedValue());
        }
        if(data.getTarget().equals("v1")){
            this.withV1(data.getTransformedValue());
        }
        if(data.getTarget().equals("v2")){
            this.withV2(data.getTransformedValue());
        }
        if(data.getTarget().equals("v3")){
            this.withV3(data.getTransformedValue());
        }
        if(data.getTarget().equals("v4")){
            this.withV4(data.getTransformedValue());
        }
        return this;
    }

    /**
     * combiner logic for collector
     * @param anotherBuilder
     * @return merged response builder
     */
    ActualDataBuilder combineWith(ActualDataBuilder anotherBuilder){
        if(this.data.equals(anotherBuilder.data)){

        }

        return this;
    }
}

public class ActualData{

    private int val1;
    private int val2;
    private int val3;
    private int val4;
    private int val5;

    @Override
    public String toString() {
        return "ActualData{" +
                "val1=" + val1 +
                ", val2=" + val2 +
                ", val3=" + val3 +
                ", val4=" + val4 +
                ", val5=" + val5 +
                '}';
    }

    ActualData() {
    }

    public ActualData(int val1, int val2, int val3, int val4, int val5) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
        this.val4 = val4;
        this.val5 = val5;
    }

    public int getVal1() {
        return val1;
    }

    void setVal1(int val1) {
        this.val1 = val1;
    }

    public int getVal2() {
        return val2;
    }

    void setVal2(int val2) {
        this.val2 = val2;
    }

    public int getVal3() {
        return val3;
    }

    void setVal3(int val3) {
        this.val3 = val3;
    }

    public int getVal4() {
        return val4;
    }

    void setVal4(int val4) {
        this.val4 = val4;
    }

    public int getVal5() {
        return val5;
    }

    void setVal5(int val5) {
        this.val5 = val5;
    }
}
