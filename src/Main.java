import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        int x;
        x=in.nextInt();
        if(x<=40)
            System.out.print(x*100);
        else
            System.out.print(4000+(x-40)*120);
    }
}
