package Algorithm;



public class bubbleSort {

    public void sort(int[] list,int n) {
        int i;
        int j;
        int temp;
        int lastswap=n-1;
        for (i = 0; i < lastswap; i++) {
            for (j = i; j < n-1; j++) {
                if (list[j] > list[j + 1]) {
                    //swap
                    temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                    lastswap=j;
                }

            }

        }
    }
    public static void main(String args []){
        int[] integerList={4,2,3,5,3,5,3,7,9,6};

        bubbleSort bubbleSort=new bubbleSort();
        bubbleSort.sort(integerList,integerList.length);
        for(int i=0;i<integerList.length;i++){
            System.out.println(integerList[i]);
        }
        System.out.println("OK");
    }
}
