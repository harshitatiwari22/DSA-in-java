
import java.util.*;
public class Discount {
    public static  void sale(int[] prices , int[] discount){
        Arrays.sort(prices);
        Arrays.sort(discount);
        double total = 0;
        // int n = Math.min(prices.length,discount.length);
        // for(int i=0;i<n;i++){
        //     int p = prices[prices.length-1-i];
        //     int d = discount[discount.length -1-i];
        //     double sum = (p*(100-d))/100.0;
        //     total += sum;
        // }
        // for(int i=n;i<prices.length;i++){
        //     int p =prices[ prices.length-1-i];
        //     total +=p;
        // }
        int i = prices.length-1;
        int j = discount.length -1;
        while(i>=0 && j>=0){
            int p = prices[i];
            int d= discount[j];
            double sum = (p*(100-d))/100.0;
            total +=sum;
            i--;
            j--;
        }
        while(i>=0){
            int p = prices[i];
            total += p ;
            i--;
        }
    
        System.out.println(total);
    }
    public static void main(String[] args) {
        int[] prices = {40, 100, 25};
int[] discount = {10, 20, 50, 60, 30};
        sale(prices,discount);
    }
    
}
