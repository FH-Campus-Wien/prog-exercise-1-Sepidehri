package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("hello world!");

    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("         __           ");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");

    }

    //todo Task 3
    public void sumOfLiterals(){
        char z ='Z' ;
        int hex = 0xface;
        int octal = 012;
        long l = 80L;
        double J = 44e-1f;
        float  k = 5.5f;
        double s = 8.88e1;
       double o = 99.9;
       int sum = z + hex + octal + (int) l + (int) J + (int) k + (int) s + (int) o ;
      System.out.println (sum);


    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number1 = scan.nextInt();
        System.out.println("Please enter another number");
        int number2 = scan.nextInt();
        int sum = number1 + number2;
        System.out.print("The sum is:");
        System.out.println(sum);


    }

    //todo Task 5
    public void swapTwoNumbers(){
        int x = 5;
        int Y =10;
        System.out.println ("before Swap: ");
        System.out.println("x:" + x);
        System.out.println("Y:" + Y);
         x = x+Y;
         Y = x-Y;
         x = x-Y;
        System.out.println ("after Swap: ");
        System.out.println("x:" + x);
        System.out.println("Y:" + Y);

    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scan = new Scanner(System.in);
        System.out.println("n1:");
        int n1 = scan.nextInt();
        System.out.println("n2:");
        int n2 = scan.nextInt();
        if (n1>n2) System.out.println ("n1>n2");
        if (n1<n2) System.out.println ("n1<n2");
        if (n1==n2) System.out.println ("n1=n2");


    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your annual Revenue");
        int annualRevenue = scan.nextInt();
        if ( annualRevenue<0 || annualRevenue>=100000) System.out.println ("Invalid Revenue");
        if (annualRevenue>=0 && annualRevenue<20000) System.out.println("Poor Sales Revenue");
        if (annualRevenue>=20000 && annualRevenue<50000) System.out.println("Average Sales Revenue");
        if (annualRevenue>=50000 && annualRevenue<80000) System.out.println("Good Sales Revenue");
        if (annualRevenue>=80000 && annualRevenue<100000) System.out.println("Excellent Sales Revenue");



    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter CommissionClass:");
        int CommissionClass = scan.nextInt();
        switch(CommissionClass){
            case 1 : System.out.println("Your Commission Rate was set to 0.01");
            break;
            case 2 : System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3 : System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4 : System.out.println("Your Commission Rate was set to 0.04");
                break;
            default : System.out.println("Your Commission Rate was set to 0.00");
        }

    }

    //todo Task 9
    public void leapyear(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Year:");
        int year = scan.nextInt();
        if(year%4!=0) System.out.println ("not a Leapyear");
        else {
            if(year%100!=0) System.out.println (" Leapyear");
            else {
                if(year%400!=0) System.out.println ("not a Leapyear");
                else {
                     System.out.println (" Leapyear");
                }
            }

        }
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Number:");
        int number = scan.nextInt();
        int s=0;
        while(number>0){
            int r=number%10;
            s=(s*10)+r;
            number=number/10;


        }
        System.out.println(s);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}