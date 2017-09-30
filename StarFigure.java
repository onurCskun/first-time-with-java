package juicebox;

public class StarFigure {
    public static void main(String[] args) {
		doStarFigure(32,8);
	}

	public static void doStarFigure(int width, int rep) {
		if(width <=0 && (width % 2) != 0 ) return;
		
		int l = rep;
		for	(int i = 0; i <= width; i+=l) {

			int j = (width / 2) - (i / 2);
			for (int sl = 0; sl < j; sl++) {
				System.out.print("/");
			}
			for (int st = 0; st < i; st++) {
				System.out.print("*");
			}
			for (int sl = 0; sl < j; sl++) {
				System.out.print("\\");
			}System.out.println();
		}
	}
}
/** output = 
////////////////\\\\\\\\\\\\\\\\
////////////********\\\\\\\\\\\\
////////****************\\\\\\\\
////************************\\\\
******************************** 
*/