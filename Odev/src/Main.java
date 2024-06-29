
public class Main {
    public static void main(String[] args) {


        Oda oda1 = new Oda("Misafir Odası", 30);

        Koltuk koltuk1 = new Koltuk(new Konum(20, 50), "Mavi", "Koltuk1",1);
        Koltuk koltuk2 = new Koltuk(new Konum(300, 100), "Gri", "Koltuk2",3);
        Masa masa = new Masa(new Konum(100, 200), "Kahverengi", "Masa1", 4,2);

        oda1.mobilyaEkle(koltuk1);
        oda1.mobilyaEkle(koltuk2);
        oda1.mobilyaEkle(masa);

        oda1.listele();
        oda1.tumunuGoster();

    }
}