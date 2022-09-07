package Question_Two;


public class Java {
	
	 void Vowel_Or_Consonant(char ch)
	    {
	        
	        	
	       if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
	                || ch == 'u' || ch == 'A' || ch == 'E' || ch== 'I'
	                || ch == 'O' || ch== 'U')
	         {
	           System.out.println("It is a Vowel.");
	         }
	        
	        
	        else if (ch >= 'a' && ch <= 'z' || ch>='A' && ch<='Z') {
	        	System.out.println("It is a consonant.");
	          }
	        else {
	        	System.out.println("error");
	        }
    }
  
    // The Driver code
    static public void main(String[] args)
    {
    	
    	Java ob = new Java();
		   ob.Vowel_Or_Consonant('p');
		   ob.Vowel_Or_Consonant('Q');
		   ob.Vowel_Or_Consonant('0');
       
    }

}
