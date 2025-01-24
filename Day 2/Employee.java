public class Employee {
    String empid;
    String empname;
    double salary;
    String designation;

     Employee(String empid1, String empname1, double  salary1, String designation1) {

        empid=empid1;
        empname=empname1;
        salary=salary1;
        designation=designation1;

    }
    void Display()
    {
        System.out.println("empid: "+empid+"empname: "+empname+"salary: "+salary+"Designation: "+designation);
    }

    void compare(Employee e)
    {
        if(salary>e.salary)
        {
            System.out.println("Highest salary is: : employee1");
        }
        else
        {
            System.out.println("Highest salary is: : employee2");
        }
    }
    public static void main(String[] args) {
        Employee ob1=new Employee("abc1", "suva", 20000, "CSE");
        ob1.Display();
        Employee ob2=new Employee("xyz1", "soham", 25000, "EE");
        ob2.Display();
        ob1.compare(ob2);
    }
    
}
