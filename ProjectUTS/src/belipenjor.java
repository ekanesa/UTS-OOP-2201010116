import java.util.Scanner;

/**
 *
 * @author Ekanesa
 */
public class belipenjor {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
             System.out.println("Selamat Datang pada aplikasi BeliPenjor");
             System.out.println("____________________________");
             System.out.println("1. Input Produk Penjor");
             System.out.println("2. Pembelian Penjor");
             System.out.println("Masukkan pilihan (1 atau 2):");

             int pilihan = scanner.nextInt();

             switch (pilihan) {
                 case 1:
                    inputpjr.page();
                     break;
                 case 2:
                     pembelian.page();
                     break;
                 default:
                     System.out.println("Pilihan tidak valid.");
             }
    }

