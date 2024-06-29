 class MuhasebeMuduru extends Muhasebe implements Arayuz, Arayuz2{

     @Override
     public int aylikSirketCirosu(int gelir, int gider) {
         return super.aylikSirketCirosu(gelir, gider);
     }
     @Override
     public double aylikSirketCirosu(double gelir, double gider) {
         return super.aylikSirketCirosu(gelir, gider);
     }
     @Override
     public double bankaOdemeYap(double odemeTutari) {
         return odemeTutari;
     }
     @Override
     public String unvanYaz() {
         return "Muhasebe Müdürü";
     }
     @Override
     public int mesaiHesapla(int mesaiSaati) {
         return (mesaiSaati*2)*birSaatlikMesaiUcreti;
     }
 }
