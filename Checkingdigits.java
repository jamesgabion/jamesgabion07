import java.util.regex.*;
public class Checkingdigits {
    public static boolean
    onlyDigits(String str)
    {
        
        String regex = "[0-9]+";
  
        Pattern p = Pattern.compile(regex);
  
        
        if (str == null) {
            return false;
        }
  
        
        Matcher m = p.matcher(str);
  
        return m.matches();
    }
  
    
    public static void main(String args[])
    {
        
        String str = "123456";
  
        System.out.println(onlyDigits(str));
    }
    
}
