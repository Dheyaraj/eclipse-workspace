import java.util.Scanner;
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*String email= sc.next();
		String username="";
		
		for(int i=0; i<email.length(); i++) {
			if(email.charAt(i)=='@') {
				break;
			}else {
				username+=email.charAt(i);
			}
		}
		System.out.println(username);
		*/
		/*
		String s = "how are you?";
		String Words[]= s.split("?");
		for(int i=0; i<Words.length ; i++) {
			System.out.print(Words[i]);
		}
		*/
		
		String s = "How are you ?";
		String str="";
		String Words []= s.split(" ");
		String revWords[] = new String[10];
		//char c = Words[3].charAt(Words[3].length()-1);
		for(int i= Words.length-1; i>=0; i--) {
			for(int j=1; j<= Words.length;j++) {
			char c = Words[i].charAt(Words[i].length()-j);
			str= str+c;
			}
		}
		System.out.println(str);
	}

}
