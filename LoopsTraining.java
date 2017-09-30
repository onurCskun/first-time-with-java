package juicebox;

public class LoopsTraining {
	  public static void main(String[] args) {
	    loopFor();
	    loopWhile();
	    loopDoWhile();
	  }
	  public static void loopFor() {
	    for(int i=0;i<=100;i++){
	      System.out.println(i);
	    }
	  }
	  public static void loopWhile() {
	    int c = 0;
	    while(c <= 100){
	      System.out.println(c);
	      c++;
	    }
	  }
	  public static void loopDoWhile() {
	    int s = 0;
	    do{
	      System.out.println(s);
	      s++;
	    }while(s <= 100);
	  }

	}
	// while ve do-while arasındaki fark, while false dönerse kod dönmez ; do-whileda ise önce do fonkisyonu devreye gireceğinden "bir defa" döner sonra dönmez.
	//