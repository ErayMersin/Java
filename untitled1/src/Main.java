public class Main {
    public static void main(String[] args) {

    MuhasebeMuduru mm = new MuhasebeMuduru();

    System.out.println(mm.aylikSirketCirosu(100,90));
    System.out.println(mm.aylikSirketCirosu(100.3,30.5));

    System.out.println(mm.unvanYaz());
    System.out.println(mm.bankaOdemeYap(300));


    Yazilimci yazilimci = new Yazilimci();

    System.out.println(yazilimci.mesaiHesapla(30));
    System.out.println(yazilimci.unvanYaz());


    }
}