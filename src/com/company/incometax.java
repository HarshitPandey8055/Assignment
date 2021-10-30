package com.company;
import java.util.Scanner;
public class incometax {
    public static void main(String[] args) {
        double tax = 0 ,it;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CTC");
        it = sc.nextDouble();

        if(it <=180000)
            tax = 0 ;
        else if(it<300000)
            tax = (0.1*(it-180000));
        else
            if(it< 500000)
                tax = (0.2*(it-300000));
            else
                tax = (0.3*(it-500000));

        System.out.println("income tax amount is" + tax);



    }
}
