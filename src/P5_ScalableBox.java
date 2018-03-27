

/*
	ISYS 320
	Name(s): Derek Rieger
	Date: 3/25/18
*/

public class P5_ScalableBox {
	
	public static final int Sub_Height = 4;

	public static void main(String[] args) {
		drawBoxCap();
		drawBoxInsides();
		drawBoxCap();
	}
	
	public static void drawBoxCap() {
		System.out.print("+");
		
		for( int capDashIndex = 1; capDashIndex <= Sub_Height - 2; capDashIndex++ ) {
			System.out.print("-");
		}
		
		System.out.println("+");
	}
	
	public static void drawBoxInsides() {
		for( int insideRowIndex = 1; insideRowIndex <= Sub_Height - 2; insideRowIndex++ ) {
			drawBoxInsideLine();
		}
	}
	
	public static void drawBoxInsideLine() {
		System.out.print("|");
		
		for( int insideRowIndex = 1; insideRowIndex <= Sub_Height - 2; insideRowIndex++ ) {
			System.out.print(".");
		}
		
		System.out.println("|");
	}

}
