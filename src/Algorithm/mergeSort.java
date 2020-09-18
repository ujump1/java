package Algorithm;
public class mergeSort {
    public void sort(int[] list,int left ,int right,int temp[]) {
        if(left>=right) {
            return;
        }
        int mid=(left+right)/2;
        sort(list, left, mid, temp);
        sort(list,mid+1,right,temp);
        merge(list,left,mid,right,temp);
    }

    public void merge(int[] list,int left ,int mid,int right,int temp[]){
        int i=left;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=right){
            if(list[i]<=list[j]){
                temp[k++]=list[i++];
            }
            else
            {
                temp[k++]=list[j++];
            }
        }
        while(i<=mid){
            temp[k++]=list[i++];
        }
        while(j<=right){
            temp[k++]=list[j++];
        }
        for (i=left,k=0;i<=right;i++)
        {
            list[i]=temp[k++];
        }
    }
    public static void main(String args []){
        int[] integerList={4,2,3,5,3,5,3,7,9,6};
        int[] temp=new int[integerList.length];
        mergeSort mergeSort=new mergeSort();
        mergeSort.sort(integerList,0,integerList.length-1,temp);
        for(int i=0;i<integerList.length;i++){
            System.out.println(integerList[i]);
        }
        System.out.println("OK");
    }
}
