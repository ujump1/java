package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class selectionSort {
    public void sort(int[] list,int n){
        int i;
        int j;
        int v;
        for (i=1;i<n;i++)
        {
            v=list[i];
            for(j=i;j>0;j--) {
                if (v < list[j - 1]) {
                    list[j] = list[j - 1];
                }
                else {
                    break;
                }
            }
            list[j]=v;
        }
    }
    public static void main(String args []){
        int[] integerList={4,2,3,5,3,5,3,7,9,6};

        selectionSort selectionSort=new selectionSort();
        selectionSort.sort(integerList,integerList.length);
        for(int i=0;i<integerList.length;i++){
            System.out.println(integerList[i]);
        }
        System.out.println("OK");
    }

}
