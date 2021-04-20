package BinarySearching;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        int Bilangan[] = {3, 10, 4, 2, 8, 13};
        int cari = 8;
        int index_1 = 0;
        int index_6 = Bilangan.length-1;
        int ketemu = 0;
        int point = 0;
        String key;
        
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan data yang dicari: ");
        key = scan.nextLine();
        
        System.out.println("isi data adalah: ");
        for (int i = 0; i < Bilangan.length; i++){
            
            System.out.print(Bilangan[i] + " ");
        }
        System.out.println("");
        System.out.println("");
                
        while ((index_1 <= index_6) && ketemu == 0){
        point = (index_1 + index_6) / 2;
        System.out.println("indeks pointer :"+ point);
            if (cari == Bilangan[point]) {
                ketemu = 1;
                System.out.println("Data " +
                cari + " Telah ditemukan pada indkes ke " + point);
            }
        
            else if (cari < Bilangan[point]){
                System.out.println("Cari di kiri ");
                index_6 = point-1; 
            }
            
            else {
                index_1 = point+1;
                System.out.println("Cari di kanan");
            }
        }
        
        
        if (ketemu == 1)
            System.out.println("kesimpulan: data ditemukan");
        else
            System.out.println("kesimpulan: data tidak ditemukan");
    System.out.println("Annisa Nadia Nur Afifah");
   }
}    
