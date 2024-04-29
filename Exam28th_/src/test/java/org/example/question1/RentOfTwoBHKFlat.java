package org.example.question1;

public class RentOfTwoBHKFlat implements Property {
    private boolean hasBalcony;

    @Override
    public double calculateRentOfFlat(int noOfPerson) {
        return 400* noOfPerson;

    }
}
