/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Aero
 * NAMA  : IRMAN NOVRYANSAH
 * KELAS : IF 1
 * NIM   : 10118018
 * Deskripsi Program : Program ini untuk menampilkan waktu saat ini melalui 
 *                     sistem.
 */
public class Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   //deklarasi variabel
        Date dNow = new Date();
        SimpleDateFormat ft =
        new SimpleDateFormat ("E yyyy.MM.dd hh:mm:ss a zzz");
        
        //output
        System.out.println("Hari ini Adalah Hari : "+ft.format(dNow));
    }
}
