package Concept;



// 1  By changing the return type :
//  class MethodOverrriding { 
//         int multiply(int a,int b){
//            return a*b;
//        }
//        double multiply(double a,double b){
//             return  a*b;
//        }
   
//    public static void main(String[] args) {
   
//     MethodOverrriding obj = new MethodOverrriding();
//            int c = obj.multiply(5,4);
//            double d = obj.multiply(5.1,4.2);
//            System.out.println("Mutiply method : returns integer : " + c);
//            System.out.println("Mutiply method : returns double : " +  d);
   
//    }




//2  By changing the number of arguments passed :
// class MethodOverrriding{
//     int multiply(int a,int b){
//        return a*b;
//    }
//    int multiply(int a,int b,int c){
//         return  a*b*c;
//    }

// public static void main(String[] args) {

//        MethodOverrriding obj = new MethodOverrriding();
//        int c = obj.multiply(5,4);
//        int d = obj.multiply(5,4,3);
//        System.out.println(c);
//        System.out.println(d);

// }
// }



class MethodOverrriding{
  
        static void foo(){
            System.out.println("Good Morning bro!");
        }
    
        static void foo(int a){
            System.out.println("Good morning " + a + " bro!");
        }
    
        static void foo(int a, int b){
            System.out.println("Good morning " + a + " bro!");
            System.out.println("Good morning " + b + " bro!");
        }
    
        static void foo(int a, int b, int c){
            System.out.println("Good morning " + a + " bro!");
            System.out.println("Good morning " + b + " bro!"); 
        }
    
        static void change(int a){
            a = 98;
        }
    
        static void change2(int [] arr){
            arr[0] = 98;
        }
        static void tellJoke(){
            System.out.println("I invented a new word!\n" +
                    "Plagiarism!");
        }
    
        public static void main(String[] args) {
            // tellJoke();
    
            // Case 1: Changing the Integer
            //int x = 45;
            //change(x);
            //System.out.println("The value of x after running change is: " + x);
    
            // Case 1: Changing the Array
            // int [] marks = {52, 73, 77, 89, 98, 94};
            // change2(marks);
            // System.out.println("The value of x after running change is: " + marks[0]);
    
    
            // Method Overloading
            foo();
            foo(3000);
            foo(3000, 4000);
            // Arguments are actual!
    
    
        }
}

   

