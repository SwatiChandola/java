import java.util.Scanner;

public class Employee {
    private String name;
    private int age;
    private String address;

    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();  // consume the newline character left by nextInt()
        System.out.print("Enter address: ");
        address = sc.nextLine();
    }

    public void showdata() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("Swati");
        Employee emp = new Employee();
        emp.getdata();
        System.out.println("Employee Details:");
        emp.showdata();
    }
}