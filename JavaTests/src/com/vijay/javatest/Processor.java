package com.vijay.javatest;

/**
 * Created by Vijay kiran on 019 19-Aug-2017.
 */
public class Processor {

    private int id;
    public Processor(int x) {
        this.id=x;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Processor : ["+this.id+"]";
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.id==((Processor)obj).getId();
    }
}
