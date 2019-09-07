package com.lolmastah;

public class Main {

    public static void main(String[] args) {
        // Chalenge 1
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some Systeem.out.println's in the two methods above as well.

        Bank testAccount = new Bank(); // "12345", 0.00, "Bob Brown", "myemail@bob.com",
        // "(087) 123-4567");
        testAccount.setNumber("62895332881641");
        System.out.println(testAccount.getNumber());
        System.out.println(testAccount.getBalance());

        testAccount.withdrawal(100.0);

        testAccount.deposit(50.0);
        testAccount.withdrawal(100.0);

        testAccount.deposit(51.0);
        testAccount.withdrawal(100.0);


        /*Vip aldoMember = new Vip();
        System.out.println(aldoMember.getName());
        System.out.println(aldoMember.getCredit());
        aldoMember.setVip("Aldo", "Aldo@gmail.com",105.000);
        aldoMember.checkVip();
        System.out.println(aldoMember.getCredit());
        */
    }
}
