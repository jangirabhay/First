import java.util.Scanner;

public class first {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int r = sc.nextInt();
                int res = 1;
    for(int i=0; i<r; i++){
        res = res*n; 
    }
    System.out.println(res);


  }
}