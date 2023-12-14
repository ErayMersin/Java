public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz.");

        String sartlar="Yurtdışı çıkış kuralları:\n+" +
                "Siyasi yasağınız bulunmaması gerekiyor.\n"+
                "150TL harç bedelini ödemeniz gerekiyor.\n"+
                "Gideceğiniz ülkeye vizeniz bulunması gerekiyor\n";

        String message="Yurtdışı şartlarından hepsini sağlamanız gerekiyor";


        while (true){

            System.out.println("*******************************************");
            System.out.println(message);
            System.out.println(sartlar);
            System.out.println("*******************************************");

            Yolcu yolcu=new Yolcu();

            System.out.println("Harç bedeli kontrol ediliyor.");
            Thread.sleep(3000);

            if(yolcu.yurtdisiHarciKontrol()==false){
                System.out.println(message);
                continue;
            }
            System.out.println("Siyasi yasak kontrol ediliyor.");
            Thread.sleep(3000);

            if(yolcu.siyasiYasakKonrtol()==false){
                System.out.println(message);
                continue;
            }
            System.out.println("Vize durumunuz kontrol ediliyor.");
            Thread.sleep(3000);

            if(yolcu.vizeDurumuKontrol()==false){
                System.out.println(message);
                continue;
            }
            System.out.println("İşlemleriniz tamamlanmıştır yurtdışına çıkabilirsiniz.");
            break;

        }

    }
}