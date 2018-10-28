import java.util.*;
class CalendarProgram
{    
    public static void main()
    {
        Scanner y= new Scanner(System.in);
        System.out.print("Enter the year : ");
        int yr = y.nextInt();
        System.out.print("Enter the month name (e.g. January) : ");
        String mname = y.next();
        //String mname1=Character.toUpperCase(mname.charAt(0))+mname.substring(1,(mname.length()));
        System.out.print("Enter the week day name (e.g. Sunday) of 1st day of "+mname+" : ");
        String wname = y.next();
        String months[] = {"","January", "February", "March", "April", "May", "June", 
                            "July", "August", "September", "October", "November", "December"};
        int D[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
         
        if((yr%400==0) || ((yr%100!=0)&&(yr%4==0)))
        {
            D[2]=29;
        }
        int max = 0;
        for(int i=1; i<=12; i++)
        {
            if(mname.equalsIgnoreCase(months[i]))
            {
                max = D[i];
            }
        }
        String days[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int f = 0;
        for(int i=0; i<7; i++)
        {
            if(wname.equalsIgnoreCase(days[i]))
            {
                f = i;
            }
        }
        int A[][] = new int[6][7];
        int x = 1, z = f;
     
        for(int i=0;i<6;i++)
        {
            for(int j=f; j<7; j++)
            {
                if(x<=max)
                {
                    A[i][j] = x;
                    x++;
                }
            }
            f = 0;
        }
        System.out.println("\n\t______________________________________________________");
        System.out.println("\t\t\t   "+Character.toUpperCase(mname.charAt(0))+mname.substring(1,(mname.length()))+" "+yr); 
        System.out.println("\t____________________________________________________"); 
        System.out.println("\tSUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
        System.out.println("\t____________________________________________________"); 
         
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<7;j++)
            {
                if(A[i][j]!=0)
                    System.out.print("\t "+A[i][j]);
                else
                    System.out.print("\t ");
            }
            System.out.println("\n\t____________________________________________________"); 
        }
}
}