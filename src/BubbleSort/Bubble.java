package BubbleSort;

public class Bubble {
 
    public static void Bubble_0(int[] Z) {
        int i=1, j, n = Z.length;
        int temp;
        while (i<n) {
            j = n-1;
            while(j>=1) {
                if (Z[j-1]>Z[j]) {
                    temp = Z[j];
                    Z[j] = Z[j-1];
                    Z[j-1] = temp;
                }
                j = j - 1;
            }
            i = i + 1;
        }
    }

    public static void urutan(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        int K[] = {3, 10, 4, 2, 8, 13};
        Bubble.urutan(K);
        Bubble.Bubble_0(K);
        Bubble.urutan(K);
        
        System.out.println("Annisa Nadia Nur Afifah");
    }
}
