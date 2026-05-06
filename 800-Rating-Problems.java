1. Halloumi Boxes 
import java.util.*;
public class Main {
    public static boolean isSorted(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            return false; // Found an out-of-order element
        }
    }
    return true;
}
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t > 0){
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scn.nextInt();
        }
        if (k == 1 && isSorted(a)) 
        {
      System.out.println("YES");
        }
        else if(k > 1){
            System.out.println("YES");
        }
        else{
        System.out.println("NO");
        }
        t--;
        }
    }
}
2. Line Trip
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t != 0){
            int n = scn.nextInt();
            int x = scn.nextInt();
           ArrayList<Integer> points = new ArrayList<>();
           points.add(0);
            for(int i=0;i<n;i++){
                int point =scn.nextInt(); 
                points.add(point);
            }
            points.add(x);
            n = points.size();
            int Max = Integer.MIN_VALUE;
               for(int i=1;i<n;i++){
                   if(i == n-1){
                        Max = Math.max(Max,2 * (points.get(i)-points.get(i-1)));
                   }
                   else{
                        Max = Math.max(Max,(points.get(i)-points.get(i-1)));
                   }
            }
            
           System.out.print(Max);
           System.out.println(); 
            t--;
        }
    }
}
