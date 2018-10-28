import java.text.*;
import java.util.*;
class currentTime 
{
    static void main()
    {
        Calendar cal=Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
        System.out.println(sdf.format(cal.getTime()));
    }
}