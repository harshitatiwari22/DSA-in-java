import java.util.*;
public class matrix{
    public static void main(String args[]){
        // int arr[][]={{2,4,6},{2,5,8}};
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[2][3];
        System.out.println("enter 6 elements");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
            }
            int minOfMax=Integer.MAX_VALUE;
     
        for(int i=0;i<arr.length;i++){
            int rowMax=arr[i][0];
            for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]>rowMax){
                rowMax=arr[i][j];
            }
                }
            if(rowMax<minOfMax){
                minOfMax=rowMax;

            }
            }
        System.out.println(minOfMax);
        
        
        }
    }
