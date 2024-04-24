import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class AsFiles {
    public static void main(String ...ak) throws Exception{
        // Path p1 = Paths.get("D:\\Java");
        // System.out.println(Files.exists(p1));
        // System.out.println(Files.notExists(p1));
        
        // // Files.delete(p1);
        // Files.createDirectory(p1); //java.nio.file.NoSuchFileException: D:\Java\Ankit\lele
        
        // System.out.println(Files.createDirectories(p1));
        // // System.out.println(Files.createFile(p1));

        Path p2 = Paths.get("C:\\Users\\ak_vishwakarma_0\\Desktop\\fake social media profile detection\\");
        
        System.out.println(p2.getNameCount());

        // Files.move(p1,p2); // p1 src, p2 = destination

        Stream<Path> str = Files.walk(p2); 
        str.forEach(p -> System.out.println(p));

        // Stream<String> str2 = Files.lines(p2);
        // str2.forEach(p-> System.out.println(p));

    }
}
