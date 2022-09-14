package Concept;

public class BreakandContinew {
    public static void main(String[] args) {  
        //using for loop  


        // break
        
        // for(int i=10;i>0;i--){  
        //     if(i==7){  
        //         break;   //break the loop
        //     }  
        //     System.out.println(i);  
        // }  


        // Continue
        for(int i=7;i>0;i--){  
            if(i==3){  
                continue;//continue skips the rest statement
            }  
            System.out.println(i);  
        }  
    }  
}
