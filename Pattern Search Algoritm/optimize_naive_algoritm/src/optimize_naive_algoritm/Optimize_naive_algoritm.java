package optimize_naive_algoritm;

import java.util.Scanner;

public class Optimize_naive_algoritm {

    static void search(String Kunci, String Huruf) {
        int C = Kunci.length();
        int D = Huruf.length();
        int i = 0;

        while (i <= D - C) {
            int j;

            for (j = 0; j < C; j++) {
                if (Huruf.charAt(i + j) != Kunci.charAt(j)) {
                    break;
                }
            }

            if (j == C) {
                System.out.println("Kunci ditemukan pada indeks ke : " + i);
                i = i + C;
            } else if (j == 0) {
                i = i + 1;
            } else {
                i = i + j;
            }
        }
    }

    /* Driver code*/
    public static void main(String[] args) {
        boolean running = true;
        String jawab;
        Scanner haris = new Scanner(System.in);

        while (running) {

            System.out.print("Masukkan Huruf : ");
            String Huruf = haris.nextLine();

            System.out.print("Masukkan Kunci : ");
            String Kunci = haris.nextLine();

            System.out.println("---------------------------------");

            search(Kunci, Huruf);

            System.out.println("---------------------------------");
            System.out.println("Apakah Anda Ingin Keluar : ");
            System.out.print("Jawab [ya/tidak] > ");
            jawab = haris.nextLine();

            if (jawab.equalsIgnoreCase("ya")) {

                running = false;
            }
        }
    }
}
