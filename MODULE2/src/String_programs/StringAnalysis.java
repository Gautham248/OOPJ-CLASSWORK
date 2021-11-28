package String_programs;
import java.util.*;

public class StringAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string:  ");
		String str=sc.nextLine();
		char ch;
		int whitespace=0,alphabet=0,special_character=0,vowel=0,consonant=0,numbers=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch==' ')
				whitespace++;
			else if(ch>='a'&&ch<='z')
			{
				alphabet++;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					vowel++;
				else
					consonant++;
			}
			else if(ch>='0'&&ch<='9')
				numbers++;
			else 
				special_character++;
	}
		System.out.println("WhiteSpace       : "+whitespace);
		System.out.println("Alphabets        : "+alphabet);
		System.out.println("Vowels           : "+vowel);
		System.out.println("Consonants       : "+consonant);
		System.out.println("Numbers          : "+numbers);
		System.out.println("SpecialCharacters: "+special_character);
		
}
}