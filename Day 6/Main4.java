class UnderageException extends Exception{
   String message;
    public UnderageException(String message) {
        this.message=message;
    }

    public String toString(){
        return message;
    }
    
}

class Main4{
    public static void main(String[] args) {
        int age=87;
        try {
            if(age<18){
                throw new UnderageException("Underage, You can't vote");
            }
            else{
                System.out.println("Eligible to vote");
            }
        } catch (UnderageException e) {
            System.out.println(e);
        }
    }
}