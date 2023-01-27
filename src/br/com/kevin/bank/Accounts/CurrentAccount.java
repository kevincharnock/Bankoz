package br.com.kevin.bank.Accounts;

import br.com.kevin.bank.Agencies.Agency;

public class CurrentAccount {

    private String accountNumber;
    private double currentValue;
    private Agency agency;

    




    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }
}
