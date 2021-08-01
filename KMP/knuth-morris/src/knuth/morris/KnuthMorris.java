package knuth.morris;

import java.util.Scanner;

public class KnuthMorris {

    void KMPSearch(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();

        
        int riss[] = new int[M];
        int j = 0; 

        
        computeLPSArray(pat, M, riss);

        int i = 0; 
        while (i < N) {
            if (pat.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
                System.out.println("Kunci ditemukan "
                        + "pada indeks ke " + (i - j));
                j = riss[j - 1];
            } 
            else if (i < N && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0) {
                    j = riss[j - 1];
                } else {
                    i = i + 1;
                }
            }
        }
    }

    void computeLPSArray(String pat, int M, int riss[]) {
        
        int len = 0;
        int i = 1;
        riss[0] = 0; 

        
        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                riss[i] = len;
                i++;
            } else 
            {
                if (len != 0) {
                    len = riss[len - 1];

                } else 
                {
                    riss[i] = len;
                    i++;
                }
            }
        }
    }

    
    public static void main(String args[]) {

        boolean jalan = true;
        String pilih;
        Scanner ris = new Scanner(System.in);

        while (jalan) {

            System.out.println("---< Knuth Morris Algoritma >---");
            System.out.println("--------------------------------");

            System.out.print("Masukkan Huruf : ");
            String txt = ris.nextLine();

            System.out.print("Masukkan Kunci : ");
            String pat = ris.nextLine();
            
            System.out.println("Hasil");
            System.out.println("--------------------------------");

            new KnuthMorris().KMPSearch(pat, txt);

            System.out.println("-------------------------------");
            System.out.println("Apakah Anda Ingin Keluar : ");
            System.out.print("Jawab [ya/tidak] > ");
            pilih = ris.nextLine();

            if (pilih.equalsIgnoreCase("ya")) {

                jalan = false;

            }
        }
    }
}
