package com.company;

public class DesktopComputer implements Machine{

    OperatingSystem operatingSystem;

    public DesktopComputer(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void work() {
        System.out.println("Desktop Computer works.");
        this.operatingSystem.workOn();
    }

}
