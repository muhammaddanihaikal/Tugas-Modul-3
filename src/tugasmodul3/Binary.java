package tugasmodul3;
import java.util.Scanner;
public class Binary {
    public static void main (String[]args){
        System.out.println("====Binary Search===="+"\n");
        
        int A[]= {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        Scanner scan = new Scanner(System.in);
        System.out.print("masukan data yang di cari : ");
        int cari =scan.nextInt();
        int N = cari;
        int batasbawah = N - 1;
        int batasatas = 0;
        boolean ketemu  = false;
        int tengah = 0; 
        
        System.out.print("isi data adalah : ");
        for ( int i =0; i<A.length; i++){
            System.out.print(A[i]+ " ");    
        }
        System.out.println(" ");
        
        while ((batasatas < batasbawah)&&(!ketemu)){
        tengah = (batasatas + batasbawah) / 2;
            if (A[tengah]==cari){
                ketemu = true;
                
            }else{
                if (A[tengah] < cari ){
                    batasatas = tengah++;
                    
                }else{
                    batasatas = tengah--;
                }
            }
            if (ketemu){
                System.out.println("data "+cari+" telah di temukan pada indeks ke "+(tengah +" baris ke "+(tengah + 1)));
            }else{
                System.out.println("data "+ cari + " tidak di temukan ");
                
            }
            System.out.println("====Thanks====");
            System.out.println();
            System.out.println("Nama : Muhammad Dani Haikal");
             
        }
               
    
    }
}