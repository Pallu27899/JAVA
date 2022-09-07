
package QuestionTwo;
  public class Main {
    public static void main(String[] args) {
        String city = "Delhi";

        switch (city) {
            case "Mumbai":
                System.out.println("Financial city");
                break;

            case "Kolkata":
                System.out.println("City of Joy");
                break;

            case "Delhi":
                System.out.println("Capital of the country");
                break;

            case "Bangalore":
                System.out.println("Cyber City");
                break;

            default:
                System.out.println("May be Other Indian City");
        }
    }
 }
