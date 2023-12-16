import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik ve Fizik Problemleri Programı");

        String islemler = "İşlemler\n"
                + "1.Dairenin alanı hesaplama\n"
                + "2.Üçgenin çevresini hesaplama\n"
                + "Çıkış 'q' ya bas";

        while (true){

            System.out.println(islemler);
            System.out.println("İşlemi seçiniz: ");
            String islem=scanner.nextLine();

            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor.");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Dairenin yarıçapı= ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();

                Problem.Matematik.daire_Alan(yaricap);

            }
            else if (islem.equals("2")){
                System.out.println("Kenar 1= ");
                int kenar1 = scanner.nextInt();
                System.out.println("Kenar 2 = ");
                int kenar2= scanner.nextInt();
                System.out.println("Kenar 3 = ");
                int kenar3=scanner.nextInt();
                scanner.nextLine();

                Problem.Matematik.ucgen_Cevresi(kenar1,kenar2,kenar3);

            }
            else if (islem.equals("3")){
                Vec vec1=new Vec("Vektör1");
                Vec vec2=new Vec("Vektör2");

                Problem.Fizik.ic_Carpim(vec1,vec2);


            }
            else {
                System.out.println("Geçersiz işlem.");
            }
        }

    }
}