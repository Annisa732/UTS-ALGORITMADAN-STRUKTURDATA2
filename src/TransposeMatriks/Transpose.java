package TransposeMatriks;

public class Transpose {

public static void main (String[] args) {
int i, j, m, n;
int matriks [][] = new int [10][10];
int transpose[][] = new int[10][10];
Scanner scan = new Scanner(System.in);
System.out.print("Masukkan jumlah baris matriks: 2");
m = scan.nextInt();
System.out.print("Masukkan jumlah kolom matriks: 3");
n = scan.nextInt();
System.out.print("Masukkan elemen matriks: 1, 2, 3, 4, 5, 6");
for(i = 0; i < m; i++) {
    for(i = 0; j < n; j++) {
        matriks[i][j] = scan.nextInt();
}
}
System.out.println("Hasil matriks: ");
for(i = 0; i < m; i++) {
    for(j = 0; j < 0; j++)
        System.out.print(matriks[i][j] + "\t");
}
        System.out.println();
        for(i = 0;  i < m; i++){
    for(i = 0; j < n; j++) {
     transpose[j][i] = matriks[i][j];
     
    System.out.println("Hasil Transpose Matriks");
    for(i = 0; i < m; i++) {
        for(j = 0; j< 0; j++)
            System.out.print(matriks[i][j] + "\t");
    }
    System.out.println();

            System.out.println();
       System.out.println("Annisa Nadia Nur Afifah");  
}

        
        
        
        
        
    }
  }    
}
