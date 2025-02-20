// App.java
// lR 2/19/25

public class App {
    public static void main(String [] args){

        Student myStudent = new Student();
        myStudent.firstName = "John";
        myStudent.lastName = "Smith";
        myStudent.major = "Architecture";
        myStudent.gpa = 3.5;
        myStudent.age = 22;
        myStudent.onProbation = false;

        Student myStudent2 = new Student();
        myStudent2.firstName = "Jane";
        myStudent2.lastName = "Doe";
        myStudent2.major = "Accounting";
        myStudent2.gpa = 4.0;
        myStudent2.age = 20;
        myStudent2.onProbation = true;


        System.out.println(myStudent2.firstName);
    }

}