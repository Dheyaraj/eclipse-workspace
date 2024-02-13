
public class intToWords {
	
	public static void words(int n ) {
		String str= Integer.toString(n);
		for(int i=0; i< str.length(); i++) {
			char button = str.charAt(i);
			switch(button) {
			case '1':
				System.out.print("One ");
				break;
			case '2':
				System.out.print("Two ");
				break;
			case '3':
				System.out.print("Three ");
				break;
			case '4':
				System.out.print("Four ");
				break;
			case '5':
				System.out.print("Five ");
				break;
			case '6':
				System.out.print("Six ");
				break;
			case '7':
				System.out.print("Seven ");
				break;	
			case '8':
				System.out.print("Eight ");
				break;
			case '9':
				System.out.print("Nine ");
				break;
			case '0':
				System.out.print("Zero ");
			default	:
				System.out.print("null ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;
		words(n);
	}

}
