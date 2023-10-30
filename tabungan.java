/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package saldo;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class tabungan {
      public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

        System.out.print("Saldo Awal (Rp): ");
        double saldoAwal = scanner.nextDouble();

        System.out.print("Bunga / Bulan (%): ");
        double bungaPerbulan = scanner.nextDouble();

        System.out.print("Saldo Target (Rp): ");
        double saldoTarget = scanner.nextDouble();

        int bulan = 0;
        NumberFormat formatter = new DecimalFormat("#,###,###");

        while (saldoAwal < saldoTarget) {
            bulan++;
            saldoAwal += saldoAwal * bungaPerbulan / 100;
            String formattedSaldo = "Rp. " + formatter.format(saldoAwal);
            formattedSaldo = formattedSaldo.replace(",", ".");
            System.out.println("Saldo di bulan ke - " + bulan + " " + formattedSaldo);
        }
    }
}
