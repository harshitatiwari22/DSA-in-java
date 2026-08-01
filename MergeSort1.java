package Sorting;
import java.util.*;
public class MergeSort1 {
    public static void mergeSort(int[] OgArr,int left,int right){
        if(left<right){
        int mid=left+(right-left)/2;
        mergeSort(OgArr,left,mid);
        mergeSort(OgArr,mid+1,right);
        merge(OgArr,left,right,mid);
        }
    }
    public static void merge(int[]OgArr,int left,int right,int mid){
        int n=mid-left+1;// for the first iteration size of both n and m is 1 bcz mid left is 0 and right is 1
        int m=right-mid;
        int[] leftArray=new int[n];//both array of size n and m respectively 
        int[] rightArray=new int[m];
        for(int i=0;i<n;i++){
            leftArray[i]=OgArr[left+i];//it store the value of 0index of ogarr
        }
        for(int j=0;j<m;j++){
            rightArray[j]=OgArr[mid+1+j];//it stores the 1st index of ogarr
        }
        int i=0;
        int j=0;
        int k=left;
        while(i<n &&j<m){
            if(leftArray[i]<=rightArray[j]){
                OgArr[k]=leftArray[i];
                i++;
            }
            else{
                OgArr[k]=rightArray[j];
                j++;
            }
            k++;
        }
        while(i<n){
            OgArr[k]=leftArray[i];
                i++;
                k++;
        }
        while(j<m){
            OgArr[k]=rightArray[j];
                j++;
                k++;
        }
    }
    public static void main(String[] args) {
        int[] OgArr={67,24,89,3,6,9,1,77};
        mergeSort(OgArr,0,OgArr.length-1);
        System.out.println(Arrays.toString(OgArr));
    }
    
}
