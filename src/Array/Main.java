package Array;

public class Main {
    public static void main(String[] args) {


        Arrayss arr=new Arrayss();

       int []numbers={1,2,3,5,4};
       int result=arr.LinearSearch(numbers,6);
        arr.binarySearch(numbers,4);
       if (result!=-1)
           System.out.println("Value found at index:"+result);
       else
           System.out.println("Value not found");

        int []numbers2= new int[8];
          arr.input(numbers2);
          // arr.delate(numbers,4);
          //arr.update(numbers,3,9);
        //arr.shiftLeft_Delete (numbers ,2);

        //arr.Travesal(numbers);

        arr.R_Travesal(numbers);
    }

}
