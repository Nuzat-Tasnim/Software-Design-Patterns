package com.company;

public class FactoryComputer {
    Computer comp;
    public Computer getComputer(String t, String h, String r, String c){
        if(t.equals("PC")){
            comp = new PC(h,r,c);
        }
        else if(t.equals("Server")){
            comp = new Server(h,r,c);
        }
        else
            return null;

        return comp;
    }
}
