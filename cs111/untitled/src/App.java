import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee();
        List<Employee> employeeList= new ArrayList<>();

        System.out.println("-- Employee Entry Form --");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scan.nextLine();
        employee.setName(name);
        System.out.println("Enter ID");
        int id = Integer.parseInt(scan.nextLine());
        employee.setIdNumber(id);
        System.out.println("Enter department");
        String department = scan.nextLine();
        employee.setDepartment(department);
        System.out.println("Enter position");
        String position = scan.nextLine();
        employee.setPosition(position);
        employeeList.add(employee);


        System.out.println("-- Employee Entry Form --");
        Employee employee1 = new Employee();
        System.out.println("Enter name");
        String name1 = scan.nextLine();
        employee1.setName(name1);
        System.out.println("Enter ID");
        int id1 = Integer.parseInt(scan.nextLine());
        employee1.setIdNumber(id1);
        System.out.println("Enter department");
        String department1 = scan.nextLine();
        employee1.setDepartment(department1);
        System.out.println("Enter position");
        String position1 = scan.nextLine();
        employee1.setPosition(position1);
        employeeList.add(employee1);


        System.out.println("-- Employee Entry Form --");
        Employee employee2 = new Employee();
        System.out.println("Enter name");
        String name2 = scan.nextLine();
        employee2.setName(name2);
        System.out.println("Enter ID");
        int id2 = Integer.parseInt(scan.nextLine());
        employee2.setIdNumber(id2);
        System.out.println("Enter department");
        String department2 = scan.nextLine();
        employee1.setDepartment(department2);
        System.out.println("Enter position");
        String position2 = scan.nextLine();
        employee1.setPosition(position2);
        employeeList.add(employee2);
        System.out.format("%12s%13s%13s%13s\n","Name","ID","Department", "Position");
        System.out.format("%12s%13d%13s%13s\n", name, id, department, position);
        System.out.format("%12s%13d%13s%13s\n", name1, id1, department1, position1);
        System.out.format("%12s%13d%13s%13s\n", name2, id2, department2, position2);


    }
}