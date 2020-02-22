package com.java.practise.design.abstractFactory;

public class BankFactory extends CustomerBankFactory {

    @Override
    public Bank getBank(String bankType) throws Exception {
        if (bankType.equals("SBI")){
            return new SBI();
        }else if (bankType.equals("HDFC")){
            return new HDFC();
        }else {
            throw new Exception("Invalid bank name passed "+bankType);
        }
    }

    @Override
    Customer getCustomer(String customerType) {
        return null;
    }
}
