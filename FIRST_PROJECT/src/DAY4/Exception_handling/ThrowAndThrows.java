package DAY4.Exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

// 1.Throw
// Used for throw exception mannually
// 2.Throws
// Used 
public class ThrowAndThrows {

    static void readFile() throws FileNotFoundException{
        FileReader fr=new FileReader("Note.txt");
    }
    public static void main(String[] args)  throws ArithmeticException{
        int age=14;

        int sum=age/0;
        System.out.println(sum);

    
    }
    
}
