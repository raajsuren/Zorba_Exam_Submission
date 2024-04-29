package org.example.question1;

public class RentOfOneBHKFlat {

    private int noOfFlate;

    public int getNoOfFlate() {
        return noOfFlate;
    }

    public void setNoOfFlate(int noOfFlate) {
        this.noOfFlate = noOfFlate;
    }

    @Override
    public String toString() {
        return "RentOfOneBHKFlat{" +
                "noOfFlate=" + noOfFlate +
                '}';
    }

    public RentOfOneBHKFlat(int noOfFlate) {
        this.noOfFlate = noOfFlate;
    }
}

