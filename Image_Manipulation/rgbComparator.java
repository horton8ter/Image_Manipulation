import java.util.*;
import java.awt.*;
/**
 * Write a description of class rgbComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rgbComparator implements Comparator<Color>
{
    // instance variables - replace the example below with your own
    private char mode;

    /**
     * Constructor for objects of class rgbComparator
     */
    public rgbComparator(String selector)
    {
        // initialise instance variables
        mode=selector.toLowerCase().charAt(0);
    }
    public rgbComparator(){
        mode=' ';
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int compare(Color a,Color b)
    {
        // put your code here
        int aTemp;
        int bTemp;
        switch(mode){
            case 'r': aTemp=a.getRed();
                      bTemp=b.getRed();
            break;
            case 'g': aTemp=a.getGreen();
                      bTemp=b.getGreen();
                      
            break;
            case 'b': aTemp=a.getBlue();
                      bTemp=b.getBlue();
            break;
            default: // do this t o just avoid a secondary sort because it would already be sorted by light/darkness
                return 0;
            
        }
        if(aTemp>bTemp){
            return 1;
        }else if(aTemp<bTemp){
            return -1;
        }else{
            return 0;
        }
        
    }
}
