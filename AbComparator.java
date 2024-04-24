import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    double cgpa;

    Student(String n, double cg) {
        name = n;
        cgpa = cg;
    }
}

public class AbComparator {
    static public void main(String... rk) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student("Sagar", 3.2));
        al.add(new Student("Ravi", 1.6));
        al.add(new Student("Sourabh", 5.2));
        al.add(new Student("Nitin", 7.19));
        al.add(new Student("Aman", 6.3));


        Stream<Student> str = al.stream().filter(s -> s.cgpa > 6);
        str.sorted((s2, s1) -> s1.name.compareTo(s2.name)).forEach(s -> System.out.println(s.name + "\t" + s.cgpa));
        
        System.out.println("\n\n");

        al.stream().sorted( (s1, s2) -> s1.cgpa > s2.cgpa ? 1 : -1 ).forEach(s -> System.out.println(s.name + "\t" + s.cgpa) );

        // Stream<Student> str = al.stream().filter(s-> s.name.equals("Aman")).forEach(s-> System.out.println(s.name+"   "+s.cgpa+"\n\n"));
        
        /*
        incompatible types: void cannot be converted to Stream<Student>
        Stream<Student> str = al.stream().filter(s-> s.name.equals("Aman")).forEach(s-> System.out.println(s.name+"   "+s.cgpa+"\n\n"));
                                                                                   ^              */


        Stream<Student> str1 = al.stream().filter(s-> s.name.equals("Aman"));
        str1.forEach(s-> System.out.println(s.name+"   "+s.cgpa+"\n\n"));

    }
}






class Employ{
    String empName;
    int sallary;
    String country;
    int empId;
    Employ(String emp, int sl, String desh, int id){
        empName = emp;
        sallary = sl;
        country = desh;
        empId = id;
    }

}
class ComparatorDemo {
        public static void main(String... ak) {
            ArrayList<Employ> al = new ArrayList<>();
            al.add(new Employ("Ankit", 200, "India", 3));
            al.add(new Employ("Zara", 100, "Uganda", 2));
            al.add(new Employ("Jordan", 500, "Nigeria", 1));
            al.add(new Employ("BabuLal", 50, "India", 4));
            
            Stream<Employ> str = al.stream().filter(s ->s.country.equals("India"));
            str.sorted((s1,s2) -> s1.empId>s2.empId ?1:-1).forEach(s -> System.out.println("Name:   "+s.empName+"  country: "+s.country+"  Sallary: "+s.sallary+"  empId: "+s.empId));
            

    
            // System.out.println(al);
        }
    
}