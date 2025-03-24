
import java.util.Vector;

class To_DO_List{
    Vector<String> tusk = new Vector<>();

    void add_tusk(int a){
        tusk.add(a);
    }
    void show_tusk(){
        for(int i=0;i<tusk.size();i++){
            System.out.println("Tusk "+i+":"+tusk.get(i));
        }
    }

    void insert_new_tusk(int a,String item){
        tusk.add(a,item);
        System.out.println("New tusk added");
        show_tusk();
    }
    void del_tusk(String a){
        tusk.remove(a);
        System.out.println("Tusk removed");
        show_tusk();
    }
}

class Main3{
    public static void main(String[] args) {
        To_DO_List ob=new To_DO_List();
        ob.add_tusk(1);
        ob.add_tusk(2);
        ob.add_tusk(3);
        ob.add_tusk(4);
        ob.add_tusk(5);
        ob.show_tusk();
        ob.insert_new_tusk(2, "6");
        ob.del_tusk("2");
    }
}
