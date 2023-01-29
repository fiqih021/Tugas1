import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        menu();
    }
    static void menu(){
        System.out.println("=======================================");
        System.out.println("\t1. penjumlahan");
        System.out.println("\t2. pengurangan");
        System.out.println("\t3. perkalian");
        System.out.println("\t4. pembagian");
        System.out.println("\t5. sisa bagi");
        System.out.println("=======================================");

        Scanner in = new Scanner(System.in);

        System.out.print("PILIHAN ANDA : ");
        int pilihan = in.nextInt();
        
        System.out.print("angka pertama = ");
        double a = in.nextDouble();
        System.out.print("angka kedua = ");
        Double b = in.nextDouble();
        
        switch (pilihan) {
            case 1:
                cetak(a+b);
                break;
            case 2:
                cetak(a-b);
                break;
            case 3:
                cetak(a*b);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("bilangan tidak bisa dibagi 0");
                }
                cetak(a/b);
                break;
            case 5:
                cetak(a%b);
                break;
        
            default:
                System.out.println("pilihan tidak ada. silahkan run ulang");
        }
    }

    public static void cetak(Double hasil) {
        try {
            File file = new File("result.txt");
            FileWriter pen = new FileWriter(file);
            pen.write(hasil.toString());
            pen.close();
            System.out.printf("silahkan lihat hasil di %s",file.getPath());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
