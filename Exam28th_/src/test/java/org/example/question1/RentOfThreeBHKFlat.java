package org.example.question1;

public class RentOfThreeBHKFlat implements Property{
    private boolean hasBalcony;

    @Override
    public double calculateRentOfFlat(int noOfPerson) {
        return 600 * noOfPerson;

    }
}
