class SortArray{
    int [] arr;
    int size;
    SortArray(int [] arr, int size){
        this.arr=arr;
        this.size=size;
    }
    void sort(){
        try {
            for(int i=0;i<size-1;i++){
                for(int j=0;j<size-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound");
        }
    }
    void show(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

class Main3{
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        SortArray s=new SortArray(arr,5);
        s.sort();
        s.show();
    }
}