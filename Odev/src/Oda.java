import java.util.ArrayList;
import java.util.List;

public class Oda {
    private String tip;
    private int alan;
    private List<Mobilya> mobilyalar;

    public Oda(String tip, int alan) {
        this.tip = tip;
        this.alan = alan;
        this.mobilyalar = new ArrayList<>();
    }

    public void mobilyaEkle(Mobilya mobilya) {
        int kullanılanAlan = 0;
        for (Mobilya m : mobilyalar) {
            kullanılanAlan += m.alanHesapla();
        }
        if (kullanılanAlan + mobilya.alanHesapla() <= alan) {
            mobilyalar.add(mobilya);
        } else {
            System.out.println("Mobilya eklenemedi, oda alanı yetersiz");
        }
    }

    public void listele() {
        System.out.println("Oda Tipi: " + tip + ", Alan: " + alan + " m2");
        for (Mobilya mobilya : mobilyalar) {
            mobilya.yazdir();
        }
    }

    public void tumunuGoster() {
        for (Mobilya mobilya : mobilyalar) {
            mobilya.goster();
        }
    }

}
