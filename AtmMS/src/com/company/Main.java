package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 0;
        String[] comment = new String[30];
        Scanner text = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("***\t\t\t ATM SYSTEM \t\t\t***");
            System.out.println("Enter Your Choice: ");
            System.out.println("Enter 1 to add a new pin number ");
            System.out.println("Enter 2 to get into your account via entering pin ");
            System.out.println("Enter 3 for Your Complain/Feedback: ");
            System.out.println("Press 9 and enter to atm atm system app. ");
            System.out.print("You Entered: ");
            choice = text.nextInt();
            if(choice==1){
                System.out.println("New Pin: ");
                int pin = text.nextInt();
                System.out.println("New first Name: ");
                String first = text.next();
                System.out.println("New last name: ");
                String last = text.next();
                ATM mtatm = new ATM(pin,first,last,0);

            }
            else if(choice==2){
                ATM myatm = new ATM();
                myatm.display();
            }
            else if(choice==3){
                System.out.println();
                int complainOption = 0;
                do{
                    System.out.println();
                    System.out.println("***\t\t\tComplain/Feedback Service\t\t\t***");
                    System.out.println("Press 1 and Add a complain");
                    System.out.println("Press 2 to view complain box");
                    System.out.println("Press 9 and enter to exit. ");
                    complainOption = text.nextInt();
                    if(complainOption==1){
                        int x = count+1;
                        System.out.println("Your complain number is "+x+" : ");
                        comment[count]=text.next();
                        count++;
                    }
                    else if(complainOption==2){
                        System.out.println();
                       System.out.println("***\t\t\tComplain/Feedback List\t\t\t***");
                        for (int i=0;i<comment.length;i++){
                            if(comment[i]!=null){
                                int x = i;
                                x++;
                            System.out.println("Compain Number "+x+" : "+comment[i]);
                            }
                        }
                    }


                }while (complainOption!=9);


            }
        }
        while (choice!=9);
    }
}
