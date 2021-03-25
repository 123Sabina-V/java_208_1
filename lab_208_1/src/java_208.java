
public class java_208 {
	  static int QuentityLetter(String str, char a  ) {
	    char[] listOfChars = str.toCharArray();
	    int count = 0 ;
	    for(int charIndex = 0 ; charIndex < listOfChars.length ; charIndex++)
	        if(listOfChars[charIndex] == a)
	            count++;
	    return count;
	}

	static int Letter(String str1,char a) {
		int count=0;
		char a1='a';
		for (int i=0;i<str1.length();i++)
		
			if (str1.charAt(i)==a1)
			
				count++;
			return count;
		}
	static int CountLetter2(String str, char ch) {
	      int count =0;
	      for(char element : str.toCharArray()) 
	        if(element == ch) 
	          count++;
	          return count;
	        }
	static int CountLetter3(String[] arrstr, char ch) {
		 int count =0;
	      for(String tmpstr : arrstr) 
	    	  for(int i=0;i<tmpstr.length();i++)
	    		  if(tmpstr.charAt(i)==ch)
	         
	          count++;
	          return count;
	        }
	

	public static void main(String[] args) {
		
		String str1 = "Sabina";
		char charToFind = 'a';
		String str2 = "Valeriaa";
		char charToFind2 = 'a';
		System.out.println("Quentity letter a in this word:" +QuentityLetter(str1,charToFind));
		System.out.println("Quentity letter a in this word:"+Letter(str2,charToFind2));
		System.out.println("Quentity letter a in this word:"+CountLetter2(str2,charToFind2));
		String[] arrstr= {"Winter","Spring","Summer","Autumn"};
		char charToFind3 = 'i';
		System.out.println("Quentity letter i in this word:"+CountLetter3(arrstr,charToFind3));
   
	}

}
