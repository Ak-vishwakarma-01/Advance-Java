// 3. Deleting a Directory with NIO
/*
java.nio.file.Files: Provides methods for working with files and directories.
java.nio.file.Path: Represents a file system path.
java.nio.file.Paths: Utility class for creating Path objects.
java.io.IOException: Exception class for potential input/output errors.
java.util.stream.Stream: Represents a sequence of elements that can be processed.
 */

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Period;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

public class AaaaCA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String newpath = sc.nextLine();
        Path directory = Paths.get(newpath);

        try (Stream<Path> walk = Files.walk(directory)) {
            walk.sorted((a, b) -> b.compareTo(a)) // reverse order; files before dirs
                .forEach(path -> {
                    try {
                        String chek = String.valueOf(path);
                        if((chek.substring(chek.length()-6, chek.length()).equals(".class"))){
                            Files.delete(path);
                        }
                    } catch (IOException e) {
                         System.out.println(e);
                    }
                });
            System.out.println("Directory deleted.");
        } catch (IOException e) {
            System.out.println(e);
        }
        
    }
}

/*
 .sorted((a, b) -> b.compareTo(a)): Sorts the stream of paths in reverse order.
 b.compareTo(a): This comparison function sorts paths with deeper nesting (subdirectories) first. 
 This can be helpful in some deletion scenarios to avoid errors (e.g., trying to delete a directory before its contents).

 The printStackTrace() method is part of the Throwable class (which IOException inherits from) in Java. 
 It prints the stack trace of an exception to the standard error output stream. The stack trace includes information about where 
 the exception occurred in the code, along with a call hierarchy leading up to the point of the exception. 
 This information is helpful for debugging purposes to identify the exact line of code that caused the error.
 */


