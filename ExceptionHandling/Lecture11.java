package ExceptionHandling;

import java.io.IOException;

class Handling{

     static void getFile() throws IOException{
         throw new IOException("XYZ");
     }
}

public class Lecture11 {
    public static void main(String[] args) {

        try {
            Handling.getFile();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

/*
Visual flow

A) With catch:

readFile()
     |
     | throws IOException
     ↓
main()
     |
     | catches it
     ↓
Program continues

B) Without catch:

readFile()
     |
     | throws IOException
     ↓
main() throws IOException
     |
     ↓
JVM
     |
     | prints stack trace
     ↓
Program terminates
----------------------------

"First, the main() method calls the readFile() method.
 Inside readFile(), an IOException is created and thrown using the throw keyword.
 Since readFile() does not handle the exception, it declares throws IOException, which passes the responsibility to its caller, main().
 In main(), the exception is handled using a try-catch block, so the exception message (File not found) is printed and
 the program continues normally."

----------------------------
If the interviewer asks, "What if main() also uses throws instead of try-catch?"

Ans : "Then main() also does not handle the exception. It passes the exception to the JVM.
Since there is no caller after main(), the JVM's default exception handler prints the exception type, message, and stack trace, and
the program terminates."

 */
