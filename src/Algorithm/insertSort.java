package Algorithm;

public class insertSort {

    public void sort(int[] list,int n) {
        int i;
        int j;
        int temp=0;
        int tempindex=0;
        for (i = n-1; i >0; i--) {
            tempindex=0;
            for (j = 0; j <i; j++) {
                if (list[tempindex] < list[j + 1]) {
                    tempindex=j+1;
                }
            }
            temp = list[tempindex];
            list[tempindex] = list[i];
            list[i] = temp;
        }
    }
    public static void main(String args []){
        int[] integerList={4,2,3,5,3,5,3,7,9,6};

        insertSort insertSort=new insertSort();
        insertSort.sort(integerList,integerList.length);
        for(int i=0;i<integerList.length;i++){
            System.out.println(integerList[i]);
        }
        System.out.println("OK");
    }
}
