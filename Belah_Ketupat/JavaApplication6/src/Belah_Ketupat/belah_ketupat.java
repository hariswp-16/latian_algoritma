package Belah_Ketupat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class belah_ketupat {

    public static void main(String[] args) throws IOException {
        int jumlah, setengahJumlah;
        String input;
        System.out.print("Masukkan jumlah:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();
        jumlah = Integer.parseInt(input);
        int l = 1;
        if (jumlah % 2 == 0) {
            setengahJumlah = jumlah / 2;
            for (int i = 0; i < setengahJumlah; i++) {
                for (int j = setengahJumlah; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= l; k++) {
                    if (k == 1 || k == l) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                l += 2;
                System.out.println();
            }
            l -= 2;
            for (int i = 0; i < setengahJumlah; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int j = l; j > 0; j--) {
                    if (j == 1 || j == l) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                l -= 2;
                System.out.println();
            }
        } else {
            setengahJumlah = (jumlah / 2);
            for (int i = 0; i < setengahJumlah; i++) {
                for (int j = setengahJumlah; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= l; k++) {
                    if (k == 1 || k == l) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                l += 2;
                System.out.println();
            }
            for (int i = 0; i < jumlah - setengahJumlah; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int j = l; j > 0; j--) {
                    if (j == l || j == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                l -= 2;
                System.out.println();
            }
        }
    }
}
