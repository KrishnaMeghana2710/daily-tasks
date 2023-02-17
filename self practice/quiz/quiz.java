import java.util.Scanner;
class quiz{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the quiz\n");
        while(true){
        System.out.println("Who is the Prime Minister of India ? \n1. Narendra Modi \n2. Dr. ManMohan Singh\n3. PranabMukherjee\n4. Sonia Gandhi \n");
        
        System.out.println("Please enter your answer: ");
        int n= sc.nextInt();
        if(n==1){
            System.out.println("YEY!!!! Right Answer\n ");
            break;
        } else{
            System.out.println("\n \nWrong answer please attempt the quiz again\n \n ");

        } 
    }
    sc.close();

    }
}