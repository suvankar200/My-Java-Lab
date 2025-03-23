
import java.util.Scanner;


class Division{

    int divident;
    int divisor;
   
    void getinput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter teh divident number");
        divident=sc.nextInt();
        System.out.println("ENter teh divisor number");
        divisor=sc.nextInt();

    }
    void dodivision()
    {
        try{
            if(divisor==0)
            {
                
                throw new ArithmeticException("Divisor cannot be zero");
            }else{
                System.out.println("Division is"+(divident/divisor));
            }
        }catch(ArithmeticException e){
                System.out.println("Exception occured"+e);
            
        }
        finally{
            System.out.println("Finally block is always executed");
        }

    }

}

class Main{
    public static void main(String[] args) {
        Division d=new Division();
        d.getinput();
        d.dodivision();
    }
}
