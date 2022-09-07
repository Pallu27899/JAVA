package Question_Three;


public class Shapes {

    void square(int side)
	    {
	        System.out.println("The area of the Square is "+Math.pow(side, 2)+" sq units");
	    }
	    void rectangle(int length, int bredth)
	    {
	        System.out.println("The area of the Rectangle is "+length*bredth+" sq units");
	    }
	    void circle(int radius)
	    {
	        double p= 3.14 * radius * radius;
	        System.out.println("The area of the Circle is "+p+" sq units");
	    }
	}
	class area 
	{
	     public static void main(String args[]) 
		{
	    	 Shapes ob = new Shapes();
		   ob.square(3);
		   ob.rectangle(5,6);
		   ob.circle(4);
	        }
	}
