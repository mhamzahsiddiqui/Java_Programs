import java.util.*;
class Partition
{
    static void partition(int n)
    {
        partition(n,n,"");
    }
    static void partition(int n,int max,String prefix)
    {
        if(n==0)
        {
            System.out.println(prefix);
            return;
        }
        for(int i=Math.min(max,n);i>=1;i--)
        {
            partition(n-i,i,prefix+" "+i);
        }
    }
    static void main()
    {
        Scanner y=new Scanner(System.in);
        System.out.println("Enter n");
        int N=y.nextInt();
        partition(N);
    }
}