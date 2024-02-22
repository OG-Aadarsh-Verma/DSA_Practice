import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
        return mergeSort(arr, 0, n-1);
    }

    private static long mergeSort(long[] arr, long low, long high){
        int cnt = 0 ;
        if(low >= high) return cnt;
        long mid = (low + high)/2;
        cnt += mergeSort(arr, low, mid);
        cnt += mergeSort(arr, mid+1, high);
        cnt += merge(arr, low, mid, high);
        return (long)cnt;
    }

    private static long merge(long[] arr, long low, long mid, long high){
        long[] temp = new long[(int)(high-low)+1];
        int left = (int)low, right = (int)mid+1;
        int cnt = 0;
        int pos = 0;

       while(left<=mid && right<=high){
           if(arr[left] <= arr[right]){
               temp[pos++] = arr[left++];
           }
           else{
               cnt += (mid-left)+1;
               temp[pos++] = arr[right++];
           }
        }

        while(left<=mid)    temp[pos++] = arr[left++];
        while(right<=high)  temp[pos++] = arr[right++];
        
        pos = 0;
        for(int i = (int)low; i<=high; i++, pos++)  arr[i] = temp[pos];
        return cnt;
    }
}
