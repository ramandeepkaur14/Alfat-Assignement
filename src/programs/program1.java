package programs;

import java.util.Scanner;

    public class program1 {
        static Scanner sc = new Scanner(System.in);
        public static final String md = "abcdefghijklmnopqrstuvwxyz";

        public static void main(String[] args) {
            // TODO Auto-generated method stub


            boolean isTrue = true;
            while(isTrue)
            {
                System.out.println("\n 1 for encryption: ");
                System.out.println("\n 2 for decryption: ");
                System.out.println("\n 5 for exit: ");
                System.out.println("\n enter choice: ");
                int choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                        encrypt();
                        break;
                    case 2:
                        decrypt();
                        break;
                    case 5:
                        isTrue=false;
                }
            }

        }
        public static void encrypt() {

            System.out.println("\n enter message for encryption: ");
            String message = sc.next().toLowerCase();
            System.out.println("enter shift key: ");
            int shiftkey = sc.nextInt();

            String cipherText = "";
            for (int i = 0; i < message.length(); i++) {
                int charPosition = md.indexOf(message.charAt(i));
                int keyVal = (shiftkey + charPosition) % 26;
                char replaceVal = md.charAt(keyVal);
                cipherText += replaceVal;
            }
            System.out.println("cipher text: "+cipherText);
        }




        public static void decrypt() {

            System.out.println("\n enter message for encryption: ");
            String message = sc.next().toLowerCase();

            System.out.println("enter shift key: ");
            int shiftkey = sc.nextInt();

            String simpletext = "";
            for (int i = 0; i<message.length(); i++) {
                int charPosition = md.indexOf(message.charAt(i));
                int keyVal = (charPosition - shiftkey) % 26;
                if (keyVal < 0) {
                    keyVal = md.length() + keyVal;
                }
                char replaceVal = md.charAt(keyVal);
                simpletext += replaceVal;
            }
            System.out.println("simple text: "+simpletext);
        }

    }





