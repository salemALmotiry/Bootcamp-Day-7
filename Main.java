import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        * 1 - Write a Java method to find the smallest number among three
           numbers. 
        * */
        System.out.print("Please enter first number : ");
        int x  = input.nextInt();

        System.out.print("Please enter first number : ");
        int y  = input.nextInt();

        System.out.print("Please enter first number : ");
        int z  = input.nextInt();

        smallest(x,y,z);


        /*
        * 2 - Write a Java method that check if the entered number is negative or
            positive or zero
        * */
//
//        System.out.print("Please enter number: ");
//        int number = input.nextInt();
//        check_num(number);

        /*
        *3 - Write a Java method to check whether a string is a valid password.
            Password rules: 
        * */
//        System.out.println("1 A password must have at least eight characters." +
//                "\n2. A password consists of only letters and digits." +
//                "\n3. A password must contain at least two digits"+
//                "\nby input a password (You are agreeing to the above Terms and Conditions.");
//        boolean valid = false;
//        while (!valid){
//
//            System.out.print("Please enter password: ");
//            String password = input.nextLine();
//
//            if(check_password(password))
//            {
//                System.out.println("Password is valid: "+password);
//                valid=true;
//            }else {
//                System.out.println("Password is not valid: "+password);
//
//            }}


    }

    

    public static void  smallest(int x , int y , int z) {

        if (x<y && x<z)
            System.out.println("the smallest is: "+ x);
        else if(y<x && y<z)
            System.out.println("the smallest is: "+ y);
        else
            System.out.println("the smallest is: "+ z);



        
    }
    
    public static void  check_num(int number ) {

        if(number >0)
            System.out.println("Number is positive");
        else if(number<0)
            System.out.println("Number is negative");
        else
            System.out.println("Number is zero");
    }
    
    public static boolean  check_password(String password) {


        if(password.length() > 10 && password.matches("[a-zA-Z]*[0-9]{2,}/*[a-zA-Z]*")) {

            return true;

        }else
            return false;

    }

}
