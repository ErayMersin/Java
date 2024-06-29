public class Masa extends Mobilya{

    private int uzunluk;
    private int genislik;

    public Masa(Konum konum, String renk, String tip, int uzunluk, int genislik) {
        super(konum, renk, tip);
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    public int getGenislik() {
        return genislik;
    }

    public void setGenislik(int genislik) {
        this.genislik = genislik;
    }

    @Override
    public void yazdir() {
        System.out.println("***Masa bilgileri***");
        System.out.println("Uzunluk: "+getUzunluk());
        System.out.println("Genişlik: "+getGenislik());
    }

    @Override
    public void goster() {
        System.out.println("Masa gösteriliyor.");
    }

    @Override
    public int alanHesapla() {
        return (getUzunluk()*getGenislik());
    }
}
