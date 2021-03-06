package se.kth.iv1350.carInspection.model;

/**
 * A inspected car.
 */
public class Car {
    private final String regNo;

    /**
     * Creates a car with the specific registration number.
     * @param regNo Newly created car's registration number.
     */
    public Car (String regNo) {
        this.regNo = regNo;
    }

    /**
     *
     * @return The Car's registration number.
     */
    public String getRegNo() {
        return regNo;
    }
}
