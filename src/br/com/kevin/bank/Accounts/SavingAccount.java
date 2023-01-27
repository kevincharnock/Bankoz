package br.com.kevin.bank.Accounts;


public class SavingAccount extends BankAccount {

    private double Income;

    public void CreditIncome(){
        this.Income=0.514 * super.getCurrentValue();

    }

    public double getIncome() {
        return Income;
    }

    public void setIncome(double income) {
        Income = income;
    }
}
