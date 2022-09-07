//Q2) Create a class Lion with following members:
//● String name;
//● boolean isHungry;
//● int age;
//● static int totalDeaths;
//● static printKillings() : void
//● thinking() : void
//printKillings() should print this ("Total killings by lions in jungle = "+ totalDeaths);
//Implement thinking() in the following manner-
//● if isHungry=false then print LionName is sleeping;
//● if isHungry=true and age>12 then increase the totalDeaths by two and print lionName has eaten two
//animal
//● if isHungry=true and age<=12 and age >=2 then increase the totalDeaths by one and print lionName
//has eaten one animal
//● if isHungry=true and age<2 then print lionName is calling Mom;
//Inside the main method of Lion Make 3 objects(lion1, lion2, lion3) of class Lion and assign valid values to
//variables and call thinking() for each object. then print totalDeaths by calling printKillings() ;



package QuetionTwo;

public class lion {

			String name;   
			boolean isHungry;    
			int age;    
			static int totalDeaths;
		    static void printKillings(){       
					System.out.println("Total killings by lions in jungle = "+totalDeaths);   
					} 
			
			void thinking(String n,boolean b,int a){  
				
				    if(isHungry==false) System.out.println(n + " is sleeping");  
				
				    else if ( isHungry==true && a>12){            
					 		
					System.out.println(n + " has eaten two animal");  
					totalDeaths=totalDeaths+2;
					
				   } else if (isHungry==true && a>=2 && a<=12){            
					System.out.println(n + " has eaten one animal");           
						totalDeaths++ ;
						
				   } else if(isHungry=true && age<2 ){            
					System.out.println(n +" is calling Mom");       
					}    
				}
			
		  public static void main(String[] args) {        
		     lion lion1 = new lion();        
			lion1.name = "lion1";       
			lion1.isHungry =true;        
			lion1.age = 15;        
			lion1.thinking(lion1.name,lion1.isHungry,lion1.age);
			
		     lion lion2 = new lion();       
			lion2.name = "lion2";        
			lion2.isHungry =true;        
			lion2.age = 11;        
			lion2.thinking(lion2.name,lion2.isHungry,lion2.age);

		     lion lion3 = new lion();       
		        lion3.name = "lion3";        
		        lion3.isHungry =true;        
		        lion3.age = 1;        
		        lion3.thinking(lion3.name,lion3.isHungry,lion3.age);
		    
		    printKillings();
		    
	 
		   
		}
}


