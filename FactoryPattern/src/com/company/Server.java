package com.company;

public class Server implements Computer {
    private String hdd;
    private String ram;
    private String cpu;

    public Server(String h,String r, String c){
        hdd=h;
        ram=r;
        cpu=c;
    }

    @Override
    public void view() {
        System.out.println("Call from Server");
        System.out.println(hdd+" "+ram+" "+cpu);
    }
}