package tr.edu.medipol.yazilimaraclari.berkaybaran;

import java.util.Scanner;

public class MuhasebeProgrami {

    public static void main(String[] args) {

        System.out.print(veri_alýmý()); 

    }

    public static int ucret_Hesaplama_islemleri(int calisilanUcret, int saatlikUcret) {

    	
        int sonuc = calisilanUcret * saatlikUcret;
         return  sonuc;
}
    class Ucret{
        int calisilanSaat;
        int saatlikUcret;
        int ucret;

 }
    public static int veri_alýmý() {

        Scanner scan =new Scanner(System.in);
        
        System.out.print("Toplam çalýþýlan saat miktarini lütfen giriniz : ");
        int calýsýlmýs_saat = scan.nextInt();

        System.out.print("Saatlik alýnan ücreti lütfen giriniz:");
        int saat_basýna_ucret = scan.nextInt();


        int hesapla = ucret_Hesaplama_islemleri(calýsýlmýs_saat,saat_basýna_ucret);
         return hesapla;

    }
}