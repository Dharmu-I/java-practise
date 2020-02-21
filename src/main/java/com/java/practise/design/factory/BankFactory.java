package com.java.practise.design.factory;

public class BankFactory {

    public static Bank getBank(String type){
        if (type.equals("HDFC")){
            return new HdfcBank();
        } else if (type.equals("SBI")){
            return new SbiBank();
        }else {
            return null;
        }
    }
}
