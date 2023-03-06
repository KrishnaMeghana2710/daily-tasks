import java.util.Scanner;
class ReadInput{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       //reading interger
       System.out.println("Enter a number : ");
       int n = scan.nextInt();
       System.out.println("The number is "+n);

       //reading char
       System.out.println("Enter a character : ");
       char character = scan.next().charAt(0);
       System.out.println("The character is :"+character);

       //reading String
       System.out.println("Enter your name : " );
       String name = scan.next();
       System.out.println("The String is : "+name);


        //closing scanner
        scan.close();


    }
}