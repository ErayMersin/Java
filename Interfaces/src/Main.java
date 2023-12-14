public class Main {
    public static void main(String[] args) {

        PCMuhendisi muhendis1 = new PCMuhendisi(false,false);

        muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalamasi(3.02));

        String[] tecrube={"Trendyol","Aselsan","HepsiBurada"};
        muhendis1.is_tecrubesi(tecrube);
    }
}