import java.io.*;
class Student{
    String stu_name;
    String stu_prog;
    String stu_sem;
    void getData() throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the student name");
        stu_name=br.readLine();
        System.out.println("Enter the student program");
        stu_prog=br.readLine();
        System.out.println("Enter the student semester");
        stu_sem=br.readLine();


    }
    void showData(){
        System.out.println("Student name is "+stu_name);
        System.out.println("Student program is "+stu_prog);
        System.out.println("Student semester is "+stu_sem);
    }



}

class Main2{
    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student();
        Student s2=new Student();
        try{
            s.getData();
            s1.getData();
            s2.getData();
        }catch(IOException e){
            System.out.println("Exception occured"+e);
        }
       
        s.showData();
        s1.showData();
        s2.showData();

    }
}
