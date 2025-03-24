import java.io. *;
import java.util.*;
 class  Hotel{
    ArrayList arr=new ArrayList(5);
    void getItem() throws  IOException
    {
        int i;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(i=0;i<5;i++){
            System.out.println("Enter the name of the item: ");
            arr.add(br.readLine());

        }
    }
    void show_hotel()
    {
        int i;
        for(i=0;i<arr.size();i++)
        {
            System.out.println("Hotel "+i+":"+arr.get(i));
        }
    }
    void insert_new_hotel(String item)
    {
      arr.add(item);
      System.out.println("New hotel added");
      show_hotel();
    }
    void change_list(String name) 
    {
        arr.set(2, name);
        System.out.println("Hotel name changed");
        show_hotel();

    }
    void del_list()
    {
        arr.remove(2);
        System.out.println("Hotel removed");
        show_hotel();
    }

    
}
class Main2{
    public static void main(String[] args)throws Exception{
        Hotel ob=new Hotel();
                    ob.getItem();
    
        //catch(IOException e){
           // System.out.println("Error in input");
        //}
        ob.show_hotel();
        ob.insert_new_hotel("taj");
        ob.change_list("nov");
        ob.del_list();
    }
}
