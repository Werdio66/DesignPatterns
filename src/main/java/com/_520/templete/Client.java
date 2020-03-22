package com._520.templete;

public class Client {

    public static void main(String[] args) {
        SoyiMilk blankSoyiMilk = new BlankSoyiMilk();
        blankSoyiMilk.make();
        System.out.println("------------------------------------");
        SoyiMilk redSoyiMilk = new RedSoyiMilk();
        redSoyiMilk.make();
        System.out.println("------------------------------------");
        SoyiMilk soyiMilk = new OnlySoyiMilk();
        soyiMilk.make();
    }
}
