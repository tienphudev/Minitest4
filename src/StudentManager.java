import java.io.IOException;
import java.util.Scanner;

public class StudentManager {
//    Scanner scanner= new Scanner(System.in);
    private int count=0;


    private Student[]students;



    public StudentManager() {
        this.students = new Student[100];;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    public  void displayStudent(){
     for (int i=0;i<students.length ;i++){
         System.out.println(students[i]);
        }
    }
    public void addStudent(Student student){
//
        if(count< students.length){
            students[count]=student;
            count++;
            System.out.println("Student add sucessfully");
        }else{
            System.out.println("Cannot add student. Maximum capacity reached.");
        }
    }
    public void updateStudent(int id,String name, int age,String email){
        for(int i=0;i < students.length;i++){
            if(students[i].getId()== id){
                students[i].setName(name);
                students[i].setAge(age);
                students[i].setEmail(email);
                System.out.println("Update sucessfully");
                break;

            }else {
                System.out.println("not found");
                break;
            }
        }
    }
    public void deleteStudent(int id){
        for(int i=0;i< students.length;i++){
            try{if(students[i].getId()!=id) {
                for (int j = 0; j < students.length - 1; i++) {
                    students[j] = students[i];
                }
                System.out.println("Delete sucessfully");
            }
            }catch (IllegalAccessError e){
                System.out.println("Student is not found");
            }
        }
    }
    public void searchByName(String name){
        for (int i=0;i<students.length;i++){
            if(students[i].getName() == name){
                System.out.println(students[i]);
            }else{
                System.out.println("Student is not found");
            }
        }
    }
    public void searchById(int id){
        for(int i=0;i< students.length;i++){
            if(students[i].getId()==id){
                System.out.println(students[i]);
            }else{
                System.out.println("Student is not found");
            }
        }
    }
}





