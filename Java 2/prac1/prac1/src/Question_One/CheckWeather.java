package Question_One;

public class CheckWeather {
	
		void snow(boolean isSnowing,double temperature,boolean isRaining) {
			
			if(isSnowing || isRaining || temperature <50.0) {
				System.out.println("Let’s stay home.");
			}else {
				System.out.println("Let's go out");
			}
			
		}

		public static void main(String[] args) {
//	        boolean isSnowing = false;
//	        boolean isRaining = false;
//	        double temperature = 60.0;
	        


			CheckWeather p = new CheckWeather() ;
					
					p.snow(false,60.0,false);
					p.snow(false, 40.0, true);
				
					
	       

	    }
			

	}





