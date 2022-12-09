package Java;

public class vowel {

	public static void main(String[] args) {
		// WAP to check if a vowel is present in a string 

		String str = new String("Hai Welcome to my World");
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i)== 'i' || str.charAt(i)== '0' || str.charAt(i)== 'u') {
				System.out.println("Given String contains "+str.charAt(i)+" at the index :" +i);
			}
		}
	}

}
