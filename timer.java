import java.util.*;
public class timer{
public static void main(String[] args) {
    String startTime = "01:00:00";
    String endTime = "01:01:25";
    String[] start =startTime.split(":");
    String[] end =endTime.split(":");
    System.out.println(Arrays.toString(start));
    int startSum =Integer.parseInt(start[0])*3600+Integer.parseInt(start[1])*60+Integer.parseInt(start[2]);
    int endSum =Integer.parseInt(end[0])*3600+Integer.parseInt(end[1])*60+Integer.parseInt(end[2]);
    int ans =Math.abs(startSum -endSum);
    System.out.println(ans);
}
}
// we can do this using .substring(index );then multiply
