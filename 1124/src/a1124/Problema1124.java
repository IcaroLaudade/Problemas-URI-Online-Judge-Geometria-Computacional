/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1124;

import java.util.Scanner;

/**
 *
 * @author Icaro
 */
public class Problema1124 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int L, C, R1, R2;
        while (true) {
            L = s.nextInt();
            C = s.nextInt();
            R1 = s.nextInt();
            R2 = s.nextInt();

            if (L == 0 && C == 0 && R1 == 0 && R2 == 0 ) {
                break;
            } else {
                if (Math.min(L, C) < 2 * Math.max(R1, R2)) {
                    System.out.println("N");
                } else {
                    int R = R1 + R2;
                    L -=R;
                    C -= R;
                    if ((L * L) + (C * C) < (R * R)) 
                    {
                      System.out.println("N");
                    } else {
                      System.out.println("S");
                    }
                }
            }

        }
    }
}
