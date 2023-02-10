public class MargeSort {
    public static void conquer(int arr[], int si,int mid, int ei){
        int merge[] = new int[ei - si + 1];

        int idx1= si;
        int idx2= mid +1;
        int x =0;
        while(idx1 <=  mid && idx2 <=ei) {
            if (arr[idx1] <= arr[idx2]){
                 merge[x++]= arr[idx1++];
                 
            }else{
                merge[x++] = arr[idx2++];
            }
        }
        while(idx1 <= mid){
              merge[x++] = arr[idx1++];
        }
        while(idx2 <=ei){
            merge[x++] = arr[idx2++];
        }
        for(int i=0, j=si; i<merge.length; i++, j++) {
             arr[j]= merge[i];
        }
    }

   public static void divide(int arr[], int si, int ei){
int  mid =  si + (ei-si)/2; //another rules mid =(si + ei)/2 but it has a space problem * si and ei ar dui ta value jodi besi boro hoye jay tai nok somay problem dakha dey
   if(si>=ei){
    return;
   }
   divide(arr,si,mid);
   divide(arr,mid+1,ei);

   conquer(arr,si,mid,ei);
}
   public static void main(String args[]) {
    int arr[]={6,5,9,3,2,8};
    int n =arr.length;

    divide(arr, 0, n-1);
    // print

    for ( int i=0; i<n;i++){
        System.out.print(arr[i]+" ");

    }
    System.out.println();
   } 
}
