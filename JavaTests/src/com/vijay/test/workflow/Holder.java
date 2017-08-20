package com.vijay.test.workflow;

/**
 * Created by Vijay kiran on 020 20-Aug-2017.
 */

public class Holder{
    private int workflow;
    private int field;
    private int fieldValue;
    private int transformedValue;
    private String target;


    public Holder(int workflow, int field, int fieldValue) {
        this.workflow = workflow;
        this.field = field;
        this.fieldValue = fieldValue;
    }

    public int getTransformedValue() {
        return transformedValue;
    }

    public void setTransformedValue(int transformedValue) {
        this.transformedValue = transformedValue;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Holder(int transformedValue, String targetKey) {
        this.transformedValue=transformedValue;
        this.target=targetKey;

    }

    public int getWorkflow() {
        return workflow;
    }

    public void setWorkflow(int workflow) {
        this.workflow = workflow;
    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    public int getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(int fieldValue) {
        this.fieldValue = fieldValue;
    }
}
