package juicebox;
// find trianguler number which has more than `n` divisor.
public class TriangulerNumber {
	  public static void main(String[] args) {
	    findTriNum(100);
	  }

	  public static void findTriNum(int n) {

	    int i = 1;
	    int x = 2;
	    boolean ex = false;
	      do {
	        if (divisors(i) > n){
	          System.out.println(i);
	          ex = true;
	        }else {
	          i += x;
	          x++;
	        }
	      } while (!ex);
	  }
	  public static int divisors (int n) {
	   int counter = 0;
	   for (int i = 1; i <= n; i++) {
	      if (n % i == 0) counter += 1;
	    }
	    return counter;
	 }
	}