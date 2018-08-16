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
        
        System.out.println("perbandingan isi x dengan y: " + x.compareTo(y));
        System.out.println("perbandingan isi x sama dengan z (Case Sensitive): "
                + x.compareTo(z));
        System.out.println("perbandingan isi x sama dengan r (Case Sensitive): "
                + x.equals(r));
        System.out.println("perbandingan isi x sama dengan r (Not Case Sensitive): "
                + x.compareToIgnoreCase(r));
        
        String s = "operasi";
        System.out.println("isi variable s : "+ s);
        System.out.println("perbandingan isi r sama dengan s (Case Sensitive): "
                + x.compareTo(s));
        
        System.out.println("pada x terdapat huruf 'a': " + x.contains("a"));
        
        System.out.println("isi variabel x besar semua : "+ x.toUpperCase());
        System.out.println("isi variabel x kecil semua : "+ x.toLowerCase());
        
        String t = "    operasi string    ";
        System.out.println("isi variabel t : \""+ t +"\"");
        System.out.println("isi variabel t tanpa spasi : \""+ t.trim() +"\"");
        
        System.out.println("gabungkan isi variabel x dan r : " + x.concat(r));
        
        System.out.println("karakter mulai posisi 3 di variabel x : " 
                + x.substring(3));
        
        System.out.println("karakter mulai posisi 3-5 di variabel x : " 
                + x.substring(3,6));
        
        String tclean = t.trim();
        System.out.println("isi variabel tclean : "+ t.trim());
        System.out.println("rubah 'i' jadi 'E' di variabel tclean : "
                + tclean.replace("i", "E"));
        
        String[] arrT = tclean.split(" ");
        System.out.println("pecah kata di variabel tclean : ");
        for (int i = 0; i < arrT.length; i++) 
            System.out.println((arrT[i]));
            
        String[] arrTr = tclean.split("r");
        System.out.println("pecah berdasarkan huruf 'r' di variabel tclean : ");
        for (int i = 0; i < arrT.length; i++) 
            System.out.println((arrTr[i]));
        }
    }

