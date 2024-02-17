package com.tugba;

public class CustomStringTr {

    String ifade= "   Bugün maratonda 1 tane test sorusu, 3 tane klasik soru bulunmaktadır.   ";

    String ifade2= "Merhaba maratondayız";

    String ifade3= "";


    public void karakterBul(){
        ifade.charAt(6); // String değeri içindeki 6. indexte bulunan karakterin çıktısını verir. m çıktısını verecek.
    }

    public void sonRastlananKonumu(){
        ifade.lastIndexOf("u"); // Strinf ifadede "u" harfinin son rastlanan konumunu verir. bulunmaktadır kelimesinde ikinci u harfini verir.
    }

    public void istenilenKadarKarakterAlma(){
        System.out.println(ifade.substring(6,12)); // burada maraton kelimesini yazdırmak için 6. indexten başlayı 12 indexe kadar karakterleri aldım.
    }

    public void baslayipBaslamadiginiKontrolEt(){
        ifade.equalsIgnoreCase(String.valueOf(ifade.startsWith("b")));
    }

    public void ifadeBosMuDoluMu(){
        ifade.isEmpty(); // ifadenin içeriğinin boş mu dolu mu olduğuna bakar.
    }

    public void bosluklariSil(){
        ifade.trim(); // ifadenin başında ve sonunda bulunan boşlukları siler. Ara boşluklara karışmaz.
    }

    public void degisiklikYap(){
        ifade.replace("ü","u"); // String ifadedeki Bugün kelimesinde bulunan u harfini ü harfine döndürür.
    }

    public void buyukHarfeCevir(){
        ifade.toUpperCase(); // String değerindeki her karakteri büyük harfle yazar.
    }

    public void kucukHarfeCevir(){
        ifade.toLowerCase(); // String değerindeki her karakteri küçük harfle yazar.
    }

    public void karakterYaDaStringDegerAra(){
        ifade.indexOf("test"); // String değerde test kelimesini arar.
        ifade.indexOf("k"); // ilk bulunan k harfinin değerini verir.
    }

    public void ifadeDoluMu(){
        ifade3.isBlank(); // isEmpty'den farkı ifade3= " "; ifadesini true döndürür.
    }

    public void ifadeleriBirlestir(){

       String birlestirilmisIfadeler= ifade.concat(ifade2); // ifade ve ifade2 String değişkenlerini birleştir.
    }

}
