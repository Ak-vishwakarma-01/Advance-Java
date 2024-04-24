import java.util.*;
import java.util.stream.*;

class Contact {
    String contact_name;
    long contact_number;
    public static ArrayList<Contact> phonebook = new ArrayList<>();

    Contact(String name, long con) {
        contact_name = name;
        contact_number = con;
        phonebook.add(this);
    }
}

public class AdMap {
    static public void main(String[] rk) {
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee("Ravi", 10, 8437360391L));
        al.add(new Employee("ABC", 10, 8523760391L));
        al.add(new Employee("ZXV", 10, 85255660391L));
        al.add(new Employee("DFGH", 10, 844525285L));
        al.add(new Employee("FGHN", 10, 7852582525L));

        // Stream <Long> str = al.stream().map(emp -> emp.mobile);

        long num = al.stream().map(emp -> {
            Contact c = new Contact(emp.name, emp.mobile);
            // Contact.phonebook.add(c);
            return c;
        }).count();
        // List <Long> contacts = str.collect(Collectors.toList());
        // for(Long l : contacts) System.out.println(l);

        // Print the Phonebook

        System.out.println(Contact.phonebook);
        for (Contact c : Contact.phonebook)
            System.out.println(c.contact_name + "\t" + c.contact_number);
    }
}

class Employee {
    String name;
    long mobile;
    int salary;

Employee(String n, int s, long m)
{
name = n; salary = s; mobile = m;
}
}













// class Contact {
//     String contact_name;
//     long contact_number;
//     public static ArrayList<Contact> phonebook = new ArrayList<>();

//     Contact(String name, long con) {
//         contact_name = name;
//         contact_number = con;
//         phonebook.add(this);
//     }
// }

// class AdMap {
//     static public void main(String... ak) {
//         ArrayList<Employee> al = new ArrayList<>();
//         al.add(new Employee("Ravi", 10, 8437360391L));
//         al.add(new Employee("ABC", 10, 8523760391L));
//         al.add(new Employee("ZXV", 10, 85255660391L));
//         al.add(new Employee("DFGH", 10, 844525285L));
//         al.add(new Employee("FGHN", 10, 7852582525L));

//         // Stream <Long> str = al.stream().map(emp -> emp.mobile);

//         long x = al.stream().map(emp -> { Contact c = new Contact(emp.name, emp.mobile);
//             // Contact.phonebook.add(c);
//             return 0;
//         }).count();
//         // List <Long> contacts = str.collect(Collectors.toList());
//         // for(Long l : contacts) System.out.println(l);

//         // Print the Phonebook

//         System.out.println(Contact.phonebook);
//         for (Contact c : Contact.phonebook)
//             System.out.println(c.contact_name + "\t" + c.contact_number);
//     }
// }

// class Employee {
//     String name;
//     long mobile;
//     int salary;

//     Employee(String n, int s, long m) {
//         name = n;
//         salary = s;
//         mobile = m;
//     }
// }









// class ReduceDemo {
//     public static void main(String[] ak){
//         ArrayList<Integer> al = new ArrayList<>();
//         al.add(6);
//         al.add(2);
//         al.add(4);
//         al.add(30);
//         al.add(7);
//         al.add(5);
//         Optional<Integer> op = al.stream().filter(a -> a % 2 == 1).reduce((x, y) -> x + y);
//         /*
//          * if(op.isPresent())
//          * System.out.println(op.get());
//          * else System.out.println("No Result");
//          */
//         op.ifPresent(x -> System.out.println(x));
//     }
// }
