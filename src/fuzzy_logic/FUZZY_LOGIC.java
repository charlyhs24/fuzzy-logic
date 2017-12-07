/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzy_logic;
import java.util.Scanner;
/**
 *
 * @author charlyhsitumorang
 * 
 */
public class FUZZY_LOGIC {

    /**
     * @param args the command line argumentsa
     */
    public static void main(String[] args) {
        fungsi fs = new fungsi();

        Scanner sc = new Scanner(System.in);
        System.out.println("================================================================");
        System.out.println("===================PROGRAM FUZZY LOGIC =========================");
        System.out.println("================================================================");
        System.out.print("JUDUL BERITA        : " );
        String berita = sc.nextLine();
        System.out.print("NILAI EMOSI         :   ");
        int emosi = sc.nextInt();
        System.out.print("NILAI PROVOKASI      :   ");
        int provokasi = sc.nextInt();
        fs.grafikemosi(emosi);
        fs.grafikprovokasi(provokasi);
        fs.inferensi();
        System.out.println("");
        System.out.println("");

        
    }
       
    
}
