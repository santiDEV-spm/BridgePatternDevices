package com.santidev;

public class BasicRemote implements Remote{

    protected Device device;

    public BasicRemote(){

    }

    public BasicRemote(Device device){
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Remote: power toggle");
        if (device.isEnable()){
            device.disable();
        }else {
            device.enable();
        }
    }

    @Override
    public void volumeUp() {
        System.out.println("Remote: volume up");
        device.setVolumen(device.getVolumen() + 10);
    }

    @Override
    public void volumeDown() {
        System.out.println("Remote: volume down");
        device.setVolumen(device.getVolumen() - 10);
    }

    @Override
    public void channelUp() {
        System.out.println("Remote: chennel up");
        device.setChannel(device.getChannel() + 1);
    }

    @Override
    public void channelDown() {
        System.out.println("Remote: chennel down");
        device.setChannel(device.getChannel() - 1);
    }
}
