public class HCF {
    public static void main(String[] args) {
        int[] arr = {12,18,37,34,446};
        int max = arr[0];
        int min = arr[0];
        for(int i =0;i<arr.length ; i++){
            if(max<arr[i]){
                max=arr[i];
            }if(min>arr[i]){
                min=arr[i];
            } 
        }
        System.out.println(max);
        System.out.println(min);
        while(min>0){
            int rem=max%min;
            max=min;
            min=rem;}
            System.out.println(max);
        
    }
}

    
    

