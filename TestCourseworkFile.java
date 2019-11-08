import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class main
{
  
    private static int Arg1;

    @Before
    public void start() 
    {
	if (args == null) 
        {
     		System.err.println("No Arguments Provided");
                System.exit(1);
	}
            try 
            {
                Arg1 = Integer.parseInt(args[0]);
            } 
            catch (NumberFormatException e) 
            {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        

    	char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
         int rem, num;
	num = Arg1;
	String hexadecimal=""; 
        System.out.println("Converting the Decimal Value " + num + " to Hex...");
        
        while(num != 0)
        {
	    rem=num%16;
	    hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }
        
        System.out.println("Hexadecimal representation is : " + hexadecimal);

    }

    @After
    public void end()
    {
        System.exit(1);
    }

    @Test
    public void ArgumentEntered()
    {
        Assert.assertTrue(Arg1 != null);
    }

    @Test
    public void ArgumentNotEntered()
    {
        Assert.assertTrue(Arg1 == null);
    }


}