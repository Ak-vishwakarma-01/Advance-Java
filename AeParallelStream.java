import java.util.ArrayList; 

public class AeParallelStream {
    public static void main(String [] ak){
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee("Ravi", 10000, 5));
        al.add(new Employee("ABC", 1000, 3));
        al.add(new Employee("ZXV", 345, 9));
        al.add(new Employee("DFGH", 765, 2));
        al.add(new Employee("FGHN", 9876, 1));

        al.stream().sorted((a,b) -> a.id> b.id ? 1:-1 ).forEach(s-> System.out.println("name: "+s.name+"    id: "+s.id+"    Sallary: "+s.salary));
        System.out.println();
    }    
}


class Employee {
    String name;
    int id;
    int salary;

    Employee(String n, int s, int m) {
        name = n;
        salary = s;
        id = m;
    }
}