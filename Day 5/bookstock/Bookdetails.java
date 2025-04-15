package bookstock;

import library.*;

public class Bookdetails extends Book{
    String title,auther,edition;

    public Bookdetails(String book_type,String acc_no,String title,String auther, String edition) {
        super(book_type,acc_no);

        this.title=title;
        this.auther=auther;
        this.edition=edition;

    }
    void display ()

    {
        System.out.println("title "+title);
        System.out.println("auther "+auther);
        System.out.println("edition "+edition);
        System.out.println("book_type "+book_type);
        System.out.println("acc_no "+acc_no);
    }
    
    
}

class Main{
    public static void main(String[] args) {
        Bookdetails ob=new Bookdetails("study","10","Java","A.Roy","2nd");
        ob.display();
    }
}
