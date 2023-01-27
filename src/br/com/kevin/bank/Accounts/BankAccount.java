package br.com.kevin.bank.Accounts;

import br.com.kevin.bank.Agencies.Agency;
import br.com.kevin.bank.BankHolders.Clients;

public class BankAccount {

    private int accountNumber;
    private byte digit;
    private Agency agency;
    private double currentValue;
    private Clients clients;

    //todo: REALIZAR CRIAÇÃO DOS MÉTODOS "DEPOSITAR" E "SACAR"

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public byte getDigit() {
        return digit;
    }

    public void setDigit(byte digit) {
        this.digit = digit;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public Clients getClients() {
        return clients;
    }

    public void setClients(Clients clients) {
        this.clients = clients;
    }
}
