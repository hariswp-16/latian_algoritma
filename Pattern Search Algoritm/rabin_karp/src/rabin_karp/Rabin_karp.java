package rabin_karp;

import java.util.Scanner;

public class Rabin_karp {

    public final static int d = 256;

    static void search(String kunci, String huruf, int q) {
        int M = kunci.length();
        int N = huruf.length();
        int i, j;
        int p = 0;
        int t = 0;
        int h = 1;

        for (i = 0; i < M - 1; i++) {
            h = (h * d) % q;
        }

        for (i = 0; i < M; i++) {
            p = (d * p + kunci.charAt(i)) % q;
            t = (d * t + huruf.charAt(i)) % q;
        }

        for (i = 0; i <= N - M; i++) {

            if (p == t) {

                for (j = 0; j < M; j++) {
                    if (huruf.charAt(i + j) != kunci.charAt(j)) {
                        break;
                    }
                }

                if (j == M) {
                    System.out.println("Kunci ditemukan pada indeks ke : " + i);
                }
            }

            if (i < N - M) {
                t = (d * (t - huruf.charAt(i) * h) + huruf.charAt(i + M)) % q;

                if (t < 0) {
                    t = (t + q);
                }
            }
        }
    }

    public static void main(String[] args) {

        boolean jalankan = true;
        String pilih;

        Scanner ris = new Scanner(System.in);

        while (jalankan) {

            System.out.println("------------------------------");
            System.out.print("Masukkan Huruf : ");

            String huruf = ris.nextLine();
            System.out.print("Masukkan Kunci : ");

            String kunci = ris.nextLine();

            System.out.println("-------------------------------");

            int q = 101;

            search(kunci, huruf, q);

            System.out.println("-------------------------------");
            System.out.println("Apakah Anda Ingin Keluar : ");
            System.out.print("Jawab [ya/tidak] > ");
            pilih = ris.nextLine();

            if (pilih.equalsIgnoreCase("ya")) {

                jalankan = false;

            }
        }
    }
}
