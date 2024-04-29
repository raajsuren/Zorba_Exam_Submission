package org.example.question1;

public class RentOfTwoBHKFlat {
    private int noOfFlate;
    private double rate;
    public RentOfTwoBHKFlat(int noOfFlat, double rate) {

    }

    public int getNoOfFlate() {
        return noOfFlate;
    }

    public void setNoOfFlate(int noOfFlate) {
        this.noOfFlate = noOfFlate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "RentOfTwoBHKFlat{" +
                "noOfFlate=" + noOfFlate +
                ", rate=" + rate +
                '}';
    }

    public RentOfTwoBHKFlat(int noOfFlate) {
        this.noOfFlate = noOfFlate;
    }
}

