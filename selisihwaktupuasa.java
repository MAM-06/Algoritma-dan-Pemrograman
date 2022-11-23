/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materi4;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class selisihwaktupuasa {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int h1, m1, h2, m2, d, J, M;
        d = 0;       
        System.out.println("Menghitung Durasi Waktu berpuasa");
        System.out.println("Jam awal =");
        h1 = input.nextInt();
        System.out.println("Menit awal=");
        m1 = input.nextInt();
        System.out.println("jam akhir=");
        h2 = input.nextInt();
        System.out.println("Menit akhir=");
        m2 = input.nextInt();
        m1 = h1 * 60 + m1;
        m2 = h2 * 60 + m2;
        if (m2 < m1) {
           } else {
                d = m2 - m1;
            }
        J = d/60;
        M = d%60;

        System.out.println("lama joko berpuasa = " + J + "jam" + M + "menit");

    }
}