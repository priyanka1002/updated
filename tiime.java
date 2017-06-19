/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liquidhub;

/**
 *
 * @author bharatPC
 */import java.text.*;
import java.util.Date;
import java.util.*;
public class tiime {

    long z;
    
    public void time()
    {
      long x,y;
        SimpleDateFormat sd = new SimpleDateFormat(
            "HH:mm");
        Date date = new Date();
        // TODO: Avoid using the abbreviations when fetching time zones.
        // Use the full Olson zone ID instead.
        sd.setTimeZone(TimeZone.getTimeZone("IST"));
      String q=(sd.format(date));
      int w=q.indexOf(":");
      String e=q.substring(w+1);
      int r=Integer.parseInt(e);
      x=r*60000;
      System.out.println(x);
      String u=q.substring(0, w);
      int i=Integer.parseInt(u);
      y=i*3600000;
            System.out.println(y);
             z=x+y;
System.out.println(z);
    }
    public static void main(String[] args) {
      tiime t=new tiime();  
      t.time();
   }
}
