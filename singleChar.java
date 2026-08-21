public class singleChar {
    public static void main(String[] args) {
        String s = "siss";
        
        char[] arr = s.toCharArray();
        for(int i =0;i<arr.length;i++){
            int count = 0;
            for(int j =i+1;j<arr.length ; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                
            }
            if(count ==0){
                System.out.println(arr[i]);
                return;
            }
        }
        

    }
    
}
