import java.util.Scanner;

public class Yolcu implements YurtDisiCikisKurallari{


    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yatırdığınız harç bedeli: ");
        this.harc=scanner.nextInt();
        scanner.nextLine();

        System.out.print("Siyasi yasağınız bulunuyor mu? (evet ya da hayır)");
        String cevap=scanner.nextLine();

        if(cevap.equals("evet")){
            this.siyasiYasak=true;
        }
        else{
            this.siyasiYasak=false;
        }

        System.out.print("Vizeniz bulunuyor mu? (evet yada hayır)");

        String cevap2=scanner.nextLine();

        if(cevap2.equals("evet")){
            this.vizeDurumu=true;
        }
        else{
            this.vizeDurumu=false;
        }
    }
    @Override
    public boolean yurtdisiHarciKontrol() {

        if(this.harc<150){
            System.out.println("Lütfen yutdışı çıkış harcınızı tam yatırın.");
            return false;
        }
        else {
            System.out.println("Yurtdışı harc işlemi tamamlandı.");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKonrtol() {

        if(this.siyasiYasak==true){
            System.out.println("Siyasi yasağınız bulunuyor yurtdışına çıkamazsınız.");
            return false;
        }
        else{
            System.out.println("Siyasi yasağınız bulunmamaktadır.");
            return true;
        }

    }

    @Override
    public boolean vizeDurumuKontrol() {

        if(this.vizeDurumu==true){
            System.out.println("Vize işlemleri tamam.");
            return true;
        }
        else{
            System.out.println("Gideceğiniz ülkeye vizeniz bulunmamaktadır.");
            return false;
        }

    }


}
