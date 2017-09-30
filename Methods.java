package juicebox;

public class Methods {
	  public static void main(String[] args) {
	    firstMethod();
	    exm(30,5);
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
	//bir matematik işlem örneği..
	  public static void exm(int a, int b) {
	    int add;
	    add = a + b;
	    int multi = add * a;
	    double divi = multi / b;
	    System.out.println("sonuç" + " " + divi);
	  }
	}
