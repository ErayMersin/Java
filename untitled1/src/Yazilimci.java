 class Yazilimci extends BilgiIslem implements Arayuz,Arayuz2{

     @Override
     public String unvanYaz() {
         return "Yazilimci";
     }

     @Override
     public int mesaiHesapla(int mesaiSaati) {
         return mesaiSaati*birSaatlikMesaiUcreti;
     }
 }
