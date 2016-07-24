package com.company;

import java.util.Scanner;

/**
 * Created by saad on 7/20/2016.
 */
public class ATM {
    public static int count=0;
    public static String[] info = new String[31];
    private int pin;
    private String firstName;
    private String lastName;
    private double balance;

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance>0)
        this.balance = balance;
    }

    public ATM(){

    }
    public ATM(int pin,String fname,String lname,double balance){
        setPin(pin);
        setFirstName(fname);
        setLastName(lname);
        setBalance(balance);
        info[count] = getFirstName()+" "+getLastName()+" "+getBalance()+" "+getPin();
        count++;

    }
    public void display(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Pin: ");
        String text = s.next();
        System.out.println();

        for (int i=0;i<info.length;i++){
            if(info[i]!=null){
            if(info[i].endsWith(text)){
                int a = info[i].indexOf(" ");
                int b = info[i].indexOf(".");
                int c = b-2;
                int d = b-1;
                System.out.println("Welcome "+info[i].substring(0,a)+"!");
                System.out.println("Last Name: "+info[i].substring(a+1,c));
                System.out.println("Current Balance: "+info[i].substring(d,b+2));
                int trans = 0;
                do {
                    System.out.println();
                    System.out.println("Press 1 and enter to add amount? ");
                    System.out.println("Press 2 and enter to do a transaction ");
                    System.out.println("Press 3 and enter to inquiry your current balance ");
                    System.out.println("Press 9 and enter to exit. ");
                    trans = s.nextInt();
                    if (trans == 1) {
                        System.out.println("Enter Amount: ");
                        double amount = s.nextDouble();
                        addbalance(amount);
                        System.out.println("Amount added...!!");
                    }
                    if (trans == 2) {
                        System.out.println("Enter Amount: ");
                        double amount = s.nextDouble();
                        delbalance(amount);
                        System.out.println("Amount cashed...!!");
                    }
                    if (trans == 3) {
                        System.out.println("Your enquiry balance is: " + getBalance());
                    }
                }while (trans!= 9);
            }}
        }
    }
    private String addbalance(double amount){
        this.balance += amount;
        return amount+" amount added";
    }
    private String delbalance(double amount){
        this.balance -= amount;
        return amount+" amount transaction";
    }
}
