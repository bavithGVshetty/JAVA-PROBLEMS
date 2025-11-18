package DAY4.Exception_handling;

import java.util.Scanner;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameInvalidException extends Exception {
    public NameInvalidException(String message) {
        super(message);
    }
}

class Student {
    int rollno;
    String name;
    int age;
    String course;

    public Student(int rollno, String name, int age, String course)
            throws AgeNotWithinRangeException, NameInvalidException {

        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age Not between 15 to 21");
        }

        if (!name.matches("[a-zA-Z]+")) {
            throw new NameInvalidException("Name not valid");
        }
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println(rollno + " " + name + " " + age + " " + course);
    }
}

public class StudentException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rollno = sc.nextInt();
        String name = sc.next();
        int age = sc.nextInt();
        String course = sc.next();
        try {
            Student s = new Student(rollno, name, age, course);
            s.display();
        } catch (AgeNotWithinRangeException e) {
            System.out.println(e.getMessage());
        } catch (NameInvalidException e) {
            System.out.println(e.getMessage());
        }
sc.close();
    }

}
