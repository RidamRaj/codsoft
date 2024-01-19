package com.CodSoft;
import java.util.*;

public class task1 {
    public static void main(String[] args) {
        int random_number = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        int guess_number = 0;
        int attempt=0;
        System.out.println("GAME START\nGUESS THE NUMBER");
        do {
            System.out.println("Enter the number between 1-100:");
            guess_number = sc.nextInt();
            attempt++;
            if (guess_number == random_number) {
                System.out.println("You Guess The Right Number");
                break;
            } 
            else if (guess_number > random_number) {
                System.out.println("The Number is too Large....");
            } else {
                System.out.println("The Number is too Small....");
            }
        } while (guess_number > 0);
        System.out.println("Number of attempt:"+attempt);
        System.out.println("GAME END");
    }

}
