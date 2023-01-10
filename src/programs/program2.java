 package programs;

        import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to count vowels: ");
        String input = sc.nextLine().toLowerCase();

        int length = input.length();
        int count = 0;

        for(int i = 0; i < length; i++)
        {
            char alphabet = input.charAt(i);
            if(alphabet  == 'a' || alphabet  == 'e' || alphabet  == 'i' || alphabet  == 'o' || alphabet  == 'u')
            {
                count++;
            }
        }
        System.out.println("Number of Vowels: " + count);
    }
}



