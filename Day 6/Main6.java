//! Write a java program to define a class Student_grade with member variables stu_name , stu_roll , grade , marks .
//! The methods are :
//! a) getData() to input values for variables using BufferedReader if the marks enter is not within range (0 - 100 )then throw an exception call " Wrong mark" and print alert message . if the grade enter is not O ,A+ , A , B , B+ , B , C+ , C , P , F 
//! then call ecception "Invalidgrade" and print alert message .

//! b) matchgrade() to match marks & grade as given in following table if doesn't match then throw exception "grade mismatch "
//! table -
//! MARK     GRADE  
//! 90-100    O 
//! 80-89    A+ 
//! 70-79    A 
//! 60-69    B+
//! 50-59    B 
//! 40-49    C 
//! 35-39    P
//! <35      F

//! c) show() to display the record of student .

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class WrongMarkException extends Exception {
    WrongMarkException(String message) {
        super(message);
    }
}

class InvalidGradeException extends Exception {
    InvalidGradeException(String message) {
        super(message);
    }
}

class GradeMismatchException extends Exception {
    GradeMismatchException(String message) {
        super(message);
    }
}

class Student_grade {
    String stu_name;
    int stu_roll;
    String grade;
    int marks;

    public void getData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter student name: ");
            stu_name = br.readLine();
            System.out.print("Enter student roll number: ");
            stu_roll = Integer.parseInt(br.readLine());
            System.out.print("Enter student marks: ");
            marks = Integer.parseInt(br.readLine());
            if (marks < 0 || marks > 100) {
                throw new WrongMarkException("Marks should be in the range of 0 to 100.");
            }
            System.out.print("Enter student grade: ");
            grade = br.readLine();
            if (!grade.matches("O|A\\+|A|B\\+|B|C\\+|C|P|F")) {
                throw new InvalidGradeException("Invalid grade entered.");
            }
        } catch (WrongMarkException | InvalidGradeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void matchgrade() throws GradeMismatchException {
        String expectedGrade;
        if (marks >= 90 && marks <= 100) {
            expectedGrade = "O";
        } else if (marks >= 80 && marks <= 89) {
            expectedGrade = "A+";
        } else if (marks >= 70 && marks <= 79) {
            expectedGrade = "A";
        } else if (marks >= 60 && marks <= 69) {
            expectedGrade = "B+";
        } else if (marks >= 50 && marks <= 59) {
            expectedGrade = "B";
        } else if (marks >= 40 && marks <= 49) {
            expectedGrade = "C";
        } else if (marks >= 35 && marks <= 39) {
            expectedGrade = "P";
        } else {
            expectedGrade = "F";
        }

        if (!grade.equals(expectedGrade)) {
            throw new GradeMismatchException("Grade does not match the marks.");
        }
    }

    public void show() {
        System.out.println("Student Details:");
        System.out.println("Name: " + stu_name);
        System.out.println("Roll Number: " + stu_roll);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

   
}
class  Main6
{
public static void main(String[] args) {
    Student_grade student = new Student_grade();
    try {
        student.getData();
        student.matchgrade();
        student.show();
    } catch (IOException | GradeMismatchException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
}