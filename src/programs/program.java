package programs;



import java.util.Scanner;

    public class program {

        public static void main(String[] args) {
            // TODO Auto-generated method stub

            Scanner sc = new Scanner(System.in);
            System.out.println("enter a string: ");
            String input = sc.nextLine().toLowerCase();

            if(input.equals("javatest")) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }


        }

    }



