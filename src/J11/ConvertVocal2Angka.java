/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J11;

import java.util.Scanner;
public class ConvertVocal2Angka {
    private static void tampilJudul(String identitas) {
        System.out.println("Identitas : "+ identitas);
         System.out.println("\nConvert Kalimat Alay Angka (Vokal ke Angka)\n");
    } 
    public static void main(String[] args){
    String identitas = "Kinara Fakhrunnisa / XR3 / 16";
    tampilJudul(identitas); 
    String kalimat = tampilInput();
}
    private static String tampilInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat asli: " + kalimat);
        
        return kalimat;
        
    }
    }