package com.company.Lesson7_21;

public class Main {

    public static void main(String[] args) {

        //21 Design a class TV
        //TV
        //channel: int
        //volumeLevel: int
        //on: boolean
        //methods
        //    turnOnOrOffTheTv()
        //    increaseVolume();
        //    decreaseVolume();
        //    changeChannel(int channelNumber);

        TV tv = new TV(5, 4, true);

        tv.turnOff();
        tv.turnOn();
        tv.decreaseVolume();
        System.out.println(tv.getVolumeLevel());
        tv.increaseVolume();
        tv.increaseVolume();
        System.out.println(tv.getVolumeLevel());
        tv.changeChannel(10);
        System.out.println(tv.getChannel());

    }
}
