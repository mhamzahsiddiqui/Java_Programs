//n1-1000;n2-500;n3-100;n4-50;n5-20;n6-10;n7-5;n8-2;n9-1
class Denominations
{
    static void main(int n)
    {
        System.out.println("Input"+n);
        System.out.println("\nOutput :");
        String word="";
        String wo[]={"","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
        for(int i=0;i<Integer.toString(n).length();i++)
        {
            char ch=Integer.toString(n).charAt(i);
            word=word+wo[(int)ch-48]+" ";
        }
        System.out.println(word);
        System.out.print("\n");
        int k=n;
        int n1=n/1000;
        n=n-(n1*1000);
        int n2=n/500;
        n=n-(n2*500);
        int n3=n/100;
        n=n-(n3*100);
        int n4=n/50;
        n=n-(n4*50);
        int n5=n/20;
        n=n-(n5*20);
        int n6=n/10;
        n=n-(n6*10);
        int n7=n/5;
        n=n-(n7*5);
        int n8=n/2;
        n=n-(n8*2);
        int n9=n/1;
        n=n-(n9*1);
        if(n1!=0)
        System.out.println(n1+" x  1000 = "+n1*1000);
        if(n2!=0)
        System.out.println(n2+"  x  500  = "+n2*500);
        if(n3!=0)
        System.out.println(n3+"  x  100  = "+n3*100);
        if(n4!=0)
        System.out.println(n4+"  x  50   = "+n4*50);
        if(n5!=0)
        System.out.println(n5+"  x  20   = "+n5*20);
        if(n6!=0)
        System.out.println(n6+"  x  10   = "+n6*10);
        if(n7!=0)
        System.out.println(n7+"  x  5    = "+n7*5);
        if(n8!=0)
        System.out.println(n8+"  x  2    = "+n8*2);
        if(n9!=0)
        System.out.println(n9+"  x  1    = "+n9*1);
        System.out.println("Total="+k);
        System.out.println("Total No Of Notes="+(n1+n2+n3+n4+n5+n6+n7+n8+n9));
    }
}