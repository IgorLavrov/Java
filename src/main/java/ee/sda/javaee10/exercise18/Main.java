package ee.sda.javaee10.exercise18;

public class Main {

    public static void main(String[] args) {

        Computer computer1 = new Computer("AMD_Athlon", 8, "NVidia Something", "IBM", "WhatTheHeck");

        Computer computer2 = new Computer("AMD_Athlon", 8, "NVidia Something", "IBM", "WhatTheHeck");

        System.out.println(computer1.equals(computer2));

    }

}
