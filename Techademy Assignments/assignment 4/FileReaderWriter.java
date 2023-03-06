import java.io.*;

public class FileReaderWriter {
    public static void main(String[] args) {
        
       
        try {
            //creating a writer object
            //when we write this line , this will create a file in this case it is output.txt
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            //writing into the file
            writer.write("Writing into a file");
            writer.write("\nHere is another line");

            //closing the objec
            writer.close();
        } catch (IOException e) {
         
            e.printStackTrace();
        }
        
        
        try {
            // creating a reader object
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;

            //this will iterate through the file
            while((line = reader.readLine())!= null){
                System.out.println(line);

            }
            //close the reader object
            reader.close();

        } catch (IOException e) {
            
            e.printStackTrace();
        }



        


    }
}
