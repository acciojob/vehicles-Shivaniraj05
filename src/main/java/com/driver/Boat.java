package com.driver;

public class Boat implements WaterVehicle{

    @Override
    public String getVehicleName() {
        return "Water Jet";
    }

    @Override
    public int getVehicleCapacity() {
        return 15;
    }
}
