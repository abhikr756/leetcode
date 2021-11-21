import java.util.*;
public class pattern7 {
        public static void main(String[] args) {
            System.out.println("enter the value for which pattern is to be printed");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int count;
            for (int i = 1; i <= n; i++)
            {
                count=i;
                for (int j = 1; j <= i; j++)
                {
    
                    System.out.print(count +" ");
                    count++;
                }
                System.out.println();
            }
        }
    }    
