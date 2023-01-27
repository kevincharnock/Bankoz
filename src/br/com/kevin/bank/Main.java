package br.com.kevin.bank;

import br.com.kevin.bank.Agencies.Agency;

public class Main {

    public static void main(String[] args) {

        Agency a1 = new Agency();

        a1.setAgencyCode(1);
        a1.setAgencyName("centro");

        System.out.println(a1.createAgency());

    }
}
