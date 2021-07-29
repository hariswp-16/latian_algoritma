package naivealgoritma;

// Java program for Naive Pattern Searching
import java.util.Scanner;

public class naive {

    public static void search(String txt, String pat) {
        int A = pat.length();
        int B = txt.length();

        for (int i = 0; i <= B - A; i++) {

            int j;

            for (j = 0; j < A; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }

            if (j == A) {
                System.out.println("Kunci ditemukan pada indeks Ke :  " + i);
            }
        }
    }

    public static void main(String[] args) {
        boolean running = true;
        String jawab;
        Scanner kunci = new Scanner(System.in);
        
        while (running) {

            
            System.out.println("------------------------------");
            System.out.print("Masukkan Huruf : ");

            String txt = kunci.nextLine();
            System.out.print("Masukkan Kunci : ");
            
            String pat = kunci.nextLine();
            
            System.out.println("-------------------------------");
            
        search(txt,pat);    
        
            System.out.println("-------------------------------");
            System.out.println("Apakah Anda Ingin Keluar : ");
            System.out.print("Jawab [ya/tidak] > ");
            jawab = kunci.nextLine();
        
            
            if( jawab.equalsIgnoreCase("ya")){
        
            running = false;
        
        }
            
        }
    }

}
