package MySort;

/**
 * Created by chaoge on 2017/6/2.
 */

public class test {
    public static void main(String []args){
        MySort sort = new MySort();
        int []a = {3,11,5,2,9,8,7,10,6,4};
        sort.insertSort(a);
        int length = a.length;
        for (int i = 0; i < length; i++){
            System.out.print(a[i] + "  ");

        }

    }
}
