
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        
        /*
                Beden Kitle İndeksi = kilo/(boy^2)
        Beden Kitle İndeksi 18,5 den düşük ise: Zayıf
        Beden Kitle İndesi 18.5 ile 25 arasında ise: Normal
        Beden Kitle İndeksi 25 ile 30 arasında ise: Fazla kilolu
        Beden kitle İndeksi 30 dan fazla ise: Obez
        */
        
        double kilo,boy;
        System.out.print("Kilonuzu giriniz: ");
        kilo = scanner.nextDouble();
        System.out.print("Boyunuzu giriniz: ");
        boy = scanner.nextDouble();
        
        double bki = kilo/(boy*boy);
        System.out.println("BKI= "+bki);
        
      if(bki<18.5){
          System.out.println("Zayıf");
      }   
      else if(bki>18.5 && bki<25){
          System.out.println("Normal");
      }
      else if(bki>25 && bki<30){
          System.out.println("Fazla kilolu");
      }
      else{
          System.out.println("Obez");
      }
}
    
}
