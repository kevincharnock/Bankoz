package br.com.kevin.bank;

import br.com.kevin.bank.Accounts.BankAccount;
import br.com.kevin.bank.Agencies.Agency;

public class Main {

    public static void main(String[] args) {

    BankAccount b1 = new BankAccount();
        b1.setCurrentValue(100);
        b1.deposit(150);
        b1.withdraw(230);
        System.out.println(b1.verifyValue());
}




}
