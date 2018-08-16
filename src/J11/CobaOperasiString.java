/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J11;

/**
 *
 * @author WINDOWS 10
 */
public class CobaOperasiString {
    public static void main(String[] args)
    {
        String identitas = "KINARA FAKHRUNNISA / XRPL3 / 16";
        System.out.println("Identitas : " + identitas);
        
        String x = "Operasi";
        System.out.println("Isi variabel x : "+ x);
        System.out.println("\""+ x + "\" panjang karakter = "+ x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("Isi variabel y : "+y);
        System.out.println("y adalah kosong : "+y.isEmpty());
                
        String z = "Operasi";
        System.out.println("Isi variabel z : "+ z);
        System.out.println("Isi x sama dengan z (Case Sensitive): "
                + x.equals(z));
        
        String r = "Operasi";
        System.out.println("Isi variabel r : "+ r);
        System.out.println("Isi x sama dengan r (Case Sensitive): "
                + x.equals(r));
        System.out.println("Isi x sama dengan r (Not Case Sensitive): "
                + x.equalsIgnoreCase(r));
    }
}
