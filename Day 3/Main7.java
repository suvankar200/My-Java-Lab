class Student{
    String name;
    String roll;
    String reg;
    Student(String n,String r,String re){
        name=n;
        roll=r;
        reg=re;
    }
}

class UGStudent extends Student{
    String course;
    UGStudent(String n,String r,String re,String c){
        super(n,r,re);
        course=c;
    }
    void display(){
        System.out.println(name+" "+roll+" "+reg+" "+course);
    }
}

class PGStudent extends Student{
    String specialization;
    PGStudent(String n,String r,String re,String c){
        super(n,r,re);
        specialization=c;
    }
    void display(){
        System.out.println(name+" "+roll+" "+reg+" "+specialization);
    }
}

class Main7{
    public static void main(String[] args){
        UGStudent ob1=new UGStudent("Rahul","101","AU001","B.Tech");
        PGStudent ob2=new PGStudent("Rohit","102","AU002","MATH");
        ob1.display();
        ob2.display();
    }
}