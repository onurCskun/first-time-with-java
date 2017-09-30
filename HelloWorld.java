package juicebox;

//1.
//Public class adı ile dosya adı aynı olmak zorundadır.
//Tek dosyada, yalnızca 1 tane public class olabilir.

public class HelloWorld {
public static void main(String[] args) {
 // 2.
 // Javada methodlar objelerden , ya da classlardan, .(nokta) ile çağrılır.
 System.out.println("Hello, World!");

 // Methodların yazılma sırası önemli değil.
 firstMethod(); // Ekrana basılan: Onur Coşkun

 // Javada "ilk olarak" sadece main method içine yazılan kod çalışır.
 // Tabi sonra kodlar, objeler vb. kendi içlerinde birbirini çağırabilir.tif
 // 4. Veri Tipleri
 // Primitive (Temel) Types
 int tamSayi = 123; // Tam sayı
 double ondalikSayi = 4.5; // Ondalık sayı. Noktadan sonra ~10-15 civarı kadar hane tutabiliyor.
 char karakter = 'o'; // Tek bir karakter. Tek tırnakla belirtilir.
 boolean dogruYanlis = true; // True veya false.

 // Reference Types. Java'nın %99'u. Genel olarak primitive dışındaki her şey.
 // String buna bir örnek. (Sonra bahsedilecek)
 String karakterDizisi = "Wow"; // Çift tırnakla belirtilir.

 System.out.println(tamSayi + " " + ondalikSayi + "\n" + karakter + " " + dogruYanlis); // 123 4.5 (yeni satır) o true
 // \n yeni satır karakteri. "+" ise Java'da Stringlerde concatenation (birleştirme) operatörü.

 System.out.println(1 + 2); // 3 basar, 12 değil. "+" stringleri concatenate eder, diğerlerini değil.

 System.out.println(karakterDizisi); // Wow.

 System.out.print("Println'ın yeni satıra geçmeyen hali.");
 System.out.print("Evet böyle bir şey."); // Println'ın yeni satıra geçmeyen hali.Evet böyle bir şey.
 System.out.println();

 tamSayi = 345; // Eskiden 123'dü, artık 345.
 System.out.println(tamSayi);

 // tamSayi = "String olamaz, bu bir int olarak tanımlandı."; // error: incompatible types: String cannot be converted to int

 for (int i=0; i<10; i++) {
   System.out.println(i);
 }
 // error: cannot find symbol.
 // Değişkenler kendi "scope"larında yaşarlar. Bu ne demek ?
 // Curly bracelerle , { } , tanımlanan her aralık bir scopedur. Methodlarda ve looplarda değişkenler bu aralık dışına çıkamaz.
 // System.out.println(i); // HATA.


 // EN ÖNEMLİSİ:
 // INDETATION. (SATIR BAŞLARININ UYUMU)

 // Her method, class tanımından sonra ve her loop vb.den sonra kod INDENT edilir.
 // Ben şu an 2 boşlukla indent ettim, ama genelde Java kodları 4 boşlukla indent edilir. 2 boşlukla etmeye DEVAM ET.
 // HERŞEYİN SATIR BAŞINA DİKKAT ET PLS.

 //şldshlfdsjhlkdjhhşlkdfjhfşdslkhlgj thats a random laugh.
 String s = 31*23 + "qwe";
 System.out.println(s);
}


// Method tanımlama.
// Şimdilik "public static void" method tanımlamak için kullanılan magic keyword.
// "firstMethod" method adı. Javada yine zorunlu olmamakla beraber method adları küçük harfle başlar.
// İlk kelimeden sonraki kelimeler ise büyük harfle başlar.
public static void firstMethod() {   // curly bracelerle method gövdesi açılıp, kapatılır.
 // Javada değişkenler tiplere bağımlı.
 String firstName; // Değişken tanımlama
 firstName = "Onur"; // Değişkene değer atama.

 String lastName = "Coşkun"; // Ya da ikisi aynı anda;

 System.out.println(firstName + " " + lastName);
}
}

//3.
//Java class adlarına kızmasa da, baş harflerini büyük yapmak genel bir konvansiyon.
//Class adlarının baş harfleri kesinlikle büyük yapılmalı.
class wow { // Yanlış.
}