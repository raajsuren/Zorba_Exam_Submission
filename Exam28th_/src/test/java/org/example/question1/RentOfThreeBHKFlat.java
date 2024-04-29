package org.example.question1;

public class RentOfThreeBHKFlat implements Property{
    private boolean hasBalcony;

    @Override
    public double calculateRentOfFlat(int noOfPerson) {
        return 600 * noOfPerson;

    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public RentOfThreeBHKFlat(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }
}
