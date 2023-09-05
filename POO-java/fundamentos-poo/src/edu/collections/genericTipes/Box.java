package edu.collections.genericTipes;

public class Box<T> {
    // sem type generic:

    // private Object object;

    // public void setObject(Object object) {
    //     this.object = object;
    // }

    // public Object getObject() {
    //     return object;
    // }

    //com type geneiric: 

    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}


