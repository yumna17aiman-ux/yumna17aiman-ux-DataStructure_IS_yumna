import java.util.Scanner;

public class Arrayss {
    Scanner input=new Scanner(System.in);

    public void Travesal(int[]a) {

        for(int i=0;i<a.length;i++)
            System.out.println("index["+i+"]"+"="+a[i]);
    }

    public void R_Travesal(int[]a) {

        for(int i=a.length-1 ; i>=0 ; i--)
            System.out.println("index["+i+"]"+"="+a[i]);
    }


    public void Travesal2(int[]a) {
        for(int e :a)
            System.out.println(e);
    }

    public void input (int []a){
        System.out.println("enter "+a.length+" numbers");
        for(int i=0;i<a.length;i++)
            a[i]=input.nextInt();
    }

    public void update(int []a ,int index,int newvalue){
        if(index<0 || index >=a.length)
            System.out.println("Index not found");
        else
            a[index]=newvalue;
    }

    public void delate(int []a ,int index){
        if(index<0 || index >=a.length)
            System.out.println("Index not found");
        else
            a[index]=0;
    }


    public void shiftLeft_Delete(int[]a,int index){
        for (int i=index;i<a.length-1;i++) {
            a[i] = a[i + 1];
        }
        a[a.length-1]=Integer.MIN_VALUE;
    }


    public int LinearSearch(int[]a,int ssvalue){
        for (int i=0; i<a.length ;i++)
            if(a[i]==ssvalue)
                return i;
        return -1;
    }
}
