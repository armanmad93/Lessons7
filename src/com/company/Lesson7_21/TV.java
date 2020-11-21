package com.company.Lesson7_21;

public class TV {

    private int channel;
    private int volumeLevel;
    private boolean on ;

    public TV(int channel, int volumeLevel, boolean on) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
        System.out.println("TV is disabled.");
    }

    public void increaseVolume() {
        volumeLevel++;
    }

    public void decreaseVolume() {
        volumeLevel--;
    }

    public int changeChannel(int changeChannel) {
        channel = changeChannel;
        return channel;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
