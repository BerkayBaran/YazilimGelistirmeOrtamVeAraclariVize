package tr.edu.medipol.yazilimaraclari.berkaybaran;

import java.util.Scanner;

public class MuhasebeProgrami {

    public static void main(String[] args) {

        System.out.print(veri_al�m�()); 

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
    public static int veri_al�m�() {

        Scanner scan =new Scanner(System.in);
        
        System.out.print("Toplam �al���lan saat miktarini l�tfen giriniz : ");
        int cal�s�lm�s_saat = scan.nextInt();

        System.out.print("Saatlik al�nan �creti l�tfen giriniz:");
        int saat_bas�na_ucret = scan.nextInt();


        int hesapla = ucret_Hesaplama_islemleri(cal�s�lm�s_saat,saat_bas�na_ucret);
         return hesapla;

    }
}