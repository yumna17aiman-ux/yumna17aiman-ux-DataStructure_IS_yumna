public class Main {
    public static void main(String[] args) {

        int []numbers={1,2,3,4,6,7,9};
        int []numbers2= new int [8];
        numbers2[3]=4;

        for(int i=0;i<numbers.length;i++)
            System.out.println("index["+i+"]"+"="+numbers[i]);
    }
}
