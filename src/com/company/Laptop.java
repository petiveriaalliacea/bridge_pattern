package com.company;

public class Laptop implements Machine{

    OperatingSystem operatingSystem;

    public Laptop(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void work() {
        System.out.println("Laptop Computer works.");
        this.operatingSystem.workOn();
    }

}
