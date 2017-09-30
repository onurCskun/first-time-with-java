package juicebox;

public class ProjectOne {
	  public static void main(String[] args) {

	    loopName();
	  }

	  public static void loopName() {
	    String s = "";
	    String s2 = "";
	    
	    for (int i = 0; i < 10; i++) {
	      s += "n";
	      s = "o" + s;

	      s2 += "r";
	      s2 = "u" + s2;
	    }

	    System.out.println(s+s2);
	  }
	}