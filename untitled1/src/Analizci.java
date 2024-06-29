 class Analizci extends BilgiIslem implements Arayuz,Arayuz2{


     @Override
     public String unvanYaz() {
         return "Analizci";
     }

     @Override
     public int mesaiHesapla(int mesaiSaati) {
         return (mesaiSaati+1)*2;
     }
 }
