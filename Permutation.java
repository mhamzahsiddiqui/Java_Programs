class permut
{
    static void main(String s)
    {
        int k=0;
        for(int i=0;i<s.length();i++)
        {
        String p=s.substring(k)+s.substring(0,k);
        k++;
        System.out.println(p );
    }
}
}