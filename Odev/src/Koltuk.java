public class Koltuk extends Mobilya{

    private int kisiSayisi;

    public Koltuk(Konum konum, String renk, String tip, int kisiSayisi) {
        super(konum, renk, tip);
        this.kisiSayisi = kisiSayisi;
    }

    public int getKisiSayisi() {
        return kisiSayisi;
    }

    public void setKisiSayisi(int kisiSayisi) {
        this.kisiSayisi = kisiSayisi;
    }

    @Override
    public void yazdir() {
        System.out.println("***Koltuk Bilgileri***");
        System.out.println("Kişi sayisi: "+getKisiSayisi());
    }

    @Override
    public void goster() {
        System.out.println("Koltuk gösteriliyor.");
    }

    @Override
    public int alanHesapla() {
        return (getKisiSayisi()*2);
    }
}
