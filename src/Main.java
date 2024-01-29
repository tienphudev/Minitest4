import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManagers = new StudentManager();
        int choice = 0;
        do {
            System.out.println("Nhap lua chon");
            System.out.println("1.Hien thi danh sach");
            System.out.println("2.Them hoc sinh");
            System.out.println("3.Sua hoc sinh");
            System.out.println("4.Xoa hoc sinh");
            System.out.println("5.Tim kiem bang ten");
            System.out.println("6.Tim kiem bang id");
            System.out.println("0.Thoat chuong trinh");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentManagers.displayStudent();
                    break;
                case 2:
                    System.out.println("Nhap id:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhap name:");
                    String name = scanner.nextLine();
                    System.out.println("Nhap age:");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhap email:");
                    String email = scanner.nextLine();
                    Student student1 = new Student(id, name, age, email);
                    studentManagers.addStudent(student1);
                    break;
                case 3:
                    System.out.println("Nhap id can sua:");
                    int a = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhap ten:");
                    String b = scanner.nextLine();
                    System.out.println("Nhap tuoi:");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("nhâp email");
                    String d = scanner.nextLine();
                    studentManagers.updateStudent(a, b, c, d);
                    break;
                case 4:
                    System.out.println("Nhap id can xoa:");
                    int e = scanner.nextInt();
                    scanner.nextLine();
                    studentManagers.deleteStudent(e);
                    break;
                case 5:
                    System.out.println("Nhap ten: ");
                    String f = scanner.nextLine();
                    studentManagers.searchByName(f);
                    break;
                case 6:
                    System.out.println("Nhap id:");
                    int g = scanner.nextInt();
                    scanner.nextLine();
                    studentManagers.searchById(g);
                    break;
            }
        } while (choice != 0);
    }
}