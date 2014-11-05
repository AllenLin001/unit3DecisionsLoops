

/**
 * Write a description of class StringCompare here.
 * 
 * @Runlong Zhang Allen Lin  
 * @over 9000! (a version number or a date)
 */
public class StringCompare
{
   public static void main (String [] args)
   {
       
       String word1 = "catlog";
       String word2 = "cat";
       int result = word1.compareTo("aaa");
       int result2 = word1.compareTo(word2);
       if (word1.equals(word2))
       {
           System.out.println("word1 = word2");
        }
       
       if (result>0)
       {
           System.out.println(result);
        }
       
       if (result2<0)
       {
           System.out.println(result2);
        }
       
       String mini1 = word1.substring(0,3);
       String mini2 = word2.substring(0,3);
       
       if (mini1.equals(mini2))
       {
           System.out.println("success");
        }
    }
    
   
      

}
