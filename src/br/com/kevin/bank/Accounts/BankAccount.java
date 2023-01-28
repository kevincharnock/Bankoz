package br.com.kevin.bank.Accounts;

import br.com.kevin.bank.Agencies.Agency;
import br.com.kevin.bank.BankHolders.Clients;

public class BankAccount {

    private int accountNumber;
    private byte digit;
    private Agency agency;
    private double currentValue;
    private Clients clients;


    public double verifyValue(){
        System.out.println("Seu saldo atual é: ");
        return this.currentValue;
    }
    public boolean withdraw(double toWithdraw){
        if (this.currentValue <= 0 ){
            System.out.println("Não foi possível realizar o saque.");
            return true;
        }
        else {
            this.currentValue -= toWithdraw;
            System.out.println("Você sacou: " + toWithdraw);
            System.out.println("Saldo atualizado: " + this.currentValue);
        }
        return false;
    }
    public boolean deposit(double depositValue){
     if (this.currentValue < this.currentValue + depositValue){
         this.currentValue += depositValue;
         System.out.println("Você depositou: " + depositValue);
         System.out.println("Saldo atualizado: "+ this.currentValue);
         return true;
     }
     else {
         System.out.println("Não foi possível processar o seu depósito, tente novamente mais tarde.");
     } return false;
    }

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
