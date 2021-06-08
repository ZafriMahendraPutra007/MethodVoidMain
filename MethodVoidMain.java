/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method.pkgvoid.main;

/**
 *
 * @author zafri
 */
public class MethodVoidMain {
String nama, makanan;
    //Agar method dapat berjalan, kita perlu mamanggilnya pada method main
    public static void main(String[] args){ 
   
        // Membuat Objek dari Class Methodvoidmain
        MethodVoidMain Hewan = new MethodVoidMain();
        System.out.println("-=-=-=KUCING=-=-=-");
        Hewan.Kucing();
        System.out.println("-=-=-=KODOK=-=-=-");
        Hewan.Kodok();
    }
    
    void Kucing(){
        nama = "Byju";
        makanan = "Wishkash";
        System.out.println("Nama Kucing Saya Adalah: "+nama);
        System.out.println("Kucing Saya Suka Makan: "+makanan);
    }
    
    void Kodok(){
        nama = "Defiton";
        makanan = "Serangga";
        System.out.println("Nama Kodok Saya Adalah: "+nama);
        System.out.println("Kodok Saya Suka Makan: "+makanan);
    }
}
