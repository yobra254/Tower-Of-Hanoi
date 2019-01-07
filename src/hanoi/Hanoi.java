/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Hanoi {


    public void solve(int n,String start, String auxillary,String end){
        
        if(n==1){
            System.out.println(start + "-->" +end);
        }else{
            
            solve(n-1,start,end,auxillary);
            System.out.println(start + "-->" +end);
            solve(n-1,auxillary,start,end);
            
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Hanoi towerOfHanoi = new Hanoi();
        System.out.println("Enter The Number Of Discs");
        Scanner scanner = new Scanner(System.in);
        int discs = scanner.nextInt();
        towerOfHanoi.solve(discs, "A" , "B" , "C" );
        
    }
    
}

