package com.company;

public class Main {

    public static void main(String[] args) {
	testMachine(new Windows());
    testMachine(new MacOS());
    }

    private static void testMachine(OperatingSystem os) {
        DesktopComputer desktopComputer = new DesktopComputer(os);
        desktopComputer.work();

        System.out.println();

        Laptop laptop = new Laptop(os);
        laptop.work();

        System.out.println();
    }
}
