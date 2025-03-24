import java.io.*;
class Item{
    String name;
    int qty;
    double price;
    
    void getData() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        name =br.readLine();
        System.out.println("Enter the quantity: ");
        qty=Integer.parseInt(br.readLine());
        System.out.println("Enter the price: ");
        price=Double.parseDouble(br.readLine());

    }
    void showData()
    {
        System.out.println("Name: "+name);
        System.out.println("Quantity: "+qty);
        System.out.println("Price: "+price);

    }

    double calprice()
    {
        return qty*price;
    }
}

class Main1{
    public static void main(String[] args){
        Item ob1=new Item();
        Item ob2=new Item();
        Item ob3=new Item();
        try{
            ob1.getData();
            ob2.getData();
            ob3.getData();
        }
        catch(IOException e){
            System.out.println("Error in input");
        }
        ob1.showData();
        ob2.showData();
        ob3.showData();
        double total=ob1.calprice()+ob2.calprice()+ob3.calprice();
        System.out.println("Total price: "+total);
    }
}