public abstract class Mobilya {

    private Konum konum;
    private String renk;
    private String tip;

    public Mobilya(Konum konum, String renk, String tip) {
        this.konum = konum;
        this.renk = renk;
        this.tip = tip;
    }

    public Konum getKonum() {
        return konum;
    }

    public void setKonum(Konum konum) {
        this.konum = konum;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public  void yazdir(){
        System.out.println("***Mobilya Bilgileri***");
        System.out.println("Konum :"+getKonum());
        System.out.println("Renk: "+getRenk());
        System.out.println("Tip: "+getTip());
    }

    public void goster(){
        System.out.println("Mobilya gösteriliyor.");
    }

    public void yeriniDeğiştir(Konum yeniKonum) {
        this.konum = yeniKonum;
    }

    public int alanHesapla(){
        return (konum.getX()*konum.getY());
    }

}
