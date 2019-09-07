package com.lolmastah;

public class Vip {
    private String name;
    private String email;
    private double credit;

    public Vip(){
        this("anonymous name", "anonymous email", 0.0);
    }

    public Vip(String name, String email, double credit) {
        System.out.println("Account constructor with parameters called");
        this.name = name;
        this.email = email;
        this.credit = credit;
    }

    public void setVip(String name, String email, double credit){
        this.name = name;
        this.email = email;
        this.credit = credit;
        System.out.println("Your Account Name: " + this.name + " email: " + this.email + " and credit: "+ this.credit);
    }

    public void checkVip (){
        if (this.credit > 100){
            System.out.println("You are a vip member with name " + this.name + " and balance: " + this.credit + " dollar in account");
        } else{
            System.out.println("You are not a vip member, increase your credit to upgrade your membership");
        }
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public double getCredit() {
        return credit;
    }
}
