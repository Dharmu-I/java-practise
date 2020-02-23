package com.java.practise.design.Facade;

public class MobileShop {
    private Mobile nokia;
    private Mobile samsung;


    public MobileShop() {
        this.nokia = new Nokia();
        this.samsung = new Samsung();
    }

    public void nokiaSale(){
        nokia.model();
        nokia.price();
    }

    public void samsungSale(){
        samsung.model();
        samsung.price();
    }
}
