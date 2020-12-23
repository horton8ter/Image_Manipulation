import java.util.*;
import java.awt.*;
/**
 * Write a description of class SortByColor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class colorComparator implements Comparator<Color>
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class SortByColor
     */
    public colorComparator()
    {
        // initialise instance variables
        
    }

  
    @Override
    public int compare(Color a,Color b)
    {
        // put your code here
        int aTemp=a.getRed()+a.getGreen()+a.getBlue();
        int bTemp=b.getRed()+b.getGreen()+b.getBlue();
        if(aTemp>bTemp){
            return 1;
        }else if(aTemp<bTemp){
            return -1;
        }else{
            return 0;
        }
        
    }
}
