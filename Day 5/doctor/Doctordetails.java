package doctor;

public  class Doctordetails {
    String docName;
    String docSpecilization;
    public Doctordetails(String docName,String docSpecilization )
    {
        this.docName=docName;
        this.docSpecilization=docSpecilization;
    }
    public void show()
    {
        System.out.println("docName"+docName);
        System.out.println("docSpecilization"+docSpecilization);
    }
    
}

