
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int bakiye = 1250;
        String islemler ="1.Bakiye Öğrenme\n"+"2.Para Çekme\n"+"3.Para Yatırma\n"+"Çıkış yapmak için 'q' ya basın";
        
        System.out.println("***************");
        System.out.println(islemler);
        System.out.println("***************");
        
        while(true){
            
            System.out.print("İşlem seçiniz: ");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Çıkış yapıldı.");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiye = "+bakiye);
            }
            else if(islem.equals("2")){
                System.out.print("Tutar giriniz: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                if(bakiye-tutar<0){
                    System.out.println("Yetersiz bakiye");
                }
                else{
                    bakiye -=tutar;
                    System.out.println("Yeni bakiye= "+bakiye);
                }
            }
            else if(islem.equals("3")){
                System.out.println("Yatıralacak tutar = ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                bakiye+=tutar;
                System.out.println("Yeni bakiye= "+bakiye);
            }
            else{
                System.out.println("Geçersiz işlem");
            }
        }
    }
}
