
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("İşlem Seçiniz\n1.Toplama\n2.Çıkart\n3.Çarp\n4.Böl");
        int islem = scanner.nextInt();
        
        switch(islem){
            case 1:
                System.out.println("Toplanacak sayıları giriniz: ");
                System.out.print("1.Sayıyı giriniz: ");
                double s1 = scanner.nextDouble();
                System.out.print("2.Sayıyı giriniz: ");
                double s2 = scanner.nextDouble();
                System.out.println("Toplama = "+(s1+s2));
                break;
            case 2:
                System.out.println("Çıkartılacak sayıları giriniz: ");
                System.out.print("1.Sayıyı giriniz: ");
                double x1 = scanner.nextDouble();
                System.out.print("2.Sayıyı giriniz: ");
                double x2 = scanner.nextDouble();
                System.out.println("Çıkartma= "+(x1-x2));
                break;
            case 3:
                System.out.println("Çarpılacak sayıları giriniz: ");
                System.out.print("1.Sayıyı giriniz: ");
                double y1 = scanner.nextDouble();
                System.out.print("2.Sayıyı giriniz: ");
                double y2 = scanner.nextDouble();
                System.out.println("Çarpma= "+(y1*y2));
                break;
            case 4:
                System.out.println("Bölünecek sayıları giriniz: ");
                System.out.print("1.Sayıyı giriniz: ");
                double z1 = scanner.nextDouble();
                System.out.print("2.Sayıyı giriniz: ");
                double z2 = scanner.nextDouble();
                System.out.println("Bölme= "+(z1/z2));
            default:
                System.out.println("Verilen işlemlerden birini seçiniz...");
                                
        }                
    }
}
