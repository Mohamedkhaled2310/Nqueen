/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package n.queen;

import java.util.Scanner;

public class Main {




public static void main(String[] args) {


        int n = 0; 
        try (Scanner s=new Scanner(System.in)) {
            while (true){
                System.out.println("Enter the number of Queens :");
                n = s.nextInt();
                if ( n == 2 || n ==3) {
                    System.out.println("No Solution possible for "+ n +" Queens. Please enter another number");
                }
                else
                    break;
            }
        }
        long timestamp1 = System.currentTimeMillis();

        System.out.println("Solution to "+ n +" queens using hill climbing search:");

        HillClimbingSearch hcs = new HillClimbingSearch(n);

        hcs.runSearch();

        if (hcs.getFinalSolution() != null)
            hcs.printState(hcs.getFinalSolution());



        //Printing the solution
        long timestamp2 = System.currentTimeMillis();

        long timeDiff = timestamp2 - timestamp1;
        System.out.println("Execution Time: "+timeDiff+" ms");


    }
}
