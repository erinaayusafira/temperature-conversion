/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suhu;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Suhu {
    public static double Konversi_Suhu (double c, double r, double f, double k){
        double hasil = c;
        return hasil;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        double c,r,f,k;
        System.out.print("Masukkan Besar Suhu Celcius = ");
        c = input.nextDouble();
        
        double hasilc = c;
        double hasilr = 0.8 * c;
        double hasilf = 1.8 * c + 32;
        double hasilk = c + 273;
        
        System.out.println("=========================");
        System.out.println("      Konversi Suhu");
        System.out.println("=========================");
        System.out.println("Besar Suhu Celcius    : "+hasilc);
        System.out.println("Besar Suhu Raeamur    : "+hasilr);
        System.out.println("Besar Suhu Fahrenheit : "+hasilf);
        System.out.println("Besar Suhu Kelvin     : "+hasilk);
    }
    
}
