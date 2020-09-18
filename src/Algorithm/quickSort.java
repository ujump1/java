package Algorithm;

public class quickSort {

    public void sort(int[] list,int start, int end) {
        int i=start;
        int j=end;
        int temp;
        int pivot=list[start];
        while(i<j)
        {
            while(list[j]>=pivot&&j>i)
            {
                j--;
            }
            while(list[i]<=pivot&&i<j){
                i++;
            }
                temp = list[j];
                list[j] = list[i];
                list[i] = temp;
        }
        temp=list[j];
        list[j]=pivot;
        list[start]=temp;
      if(i>start)
            sort(list,start,i-1);
      if(j<end)
            sort(list,j+1,end);
    }
    public static void main(String args []){
        int[] integerList={4,2,3,5,3,5,3,7,9,6};

        quickSort quickSort=new quickSort();
        quickSort.sort(integerList,0,integerList.length-1);
        for(int i=0;i<integerList.length;i++){
            System.out.println(integerList[i]);
        }
        System.out.println("OK");
    }
}
