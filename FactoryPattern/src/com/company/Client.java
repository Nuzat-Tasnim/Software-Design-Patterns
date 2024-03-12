package com.company;

public class Client {
    public static void main(String Args[]){

        FactoryComputer fc = new FactoryComputer();
        Computer pc = fc.getComputer("PC","ssd","8GB","toshiba");
        Computer server = fc.getComputer("Server","ssd","8GB","toshiba");

        pc.view();
        server.view();
    }
}
