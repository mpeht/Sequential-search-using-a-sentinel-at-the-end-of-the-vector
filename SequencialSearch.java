/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequencialsearch;

import java.util.Scanner;

/**
 *
 * @author mpeht
 */
public class SequencialSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
       
        int [] vet = new int[11];
        int i, num;
        System.out.println("Fill the array :");
        for(i = 0; i < 10; i++) {
            System.out.print("Item " + (i +1) + ": ");
            vet[i] = in.nextInt();
        }
        System.out.print("Enter the number that you wish search:");
        num = in.nextInt();
        search(vet, num);
    }
    
    public static void search(int vet [], int num) {
        int last = vet.length - 1;
        vet[last] = num;
        boolean match = true;
        for(int j = 0; j < vet.length; j++) {
            if(vet[j] == num && j != last)   {
                System.out.println("Matched");
                match = true;
            }else{
                match = false;
            }
        }
    }
    
}
