package BinTree;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest
    extends TestCase
{
    public AppTest( String testName )
    {
	super( testName );

    }
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testApp()
    {
	BinTreeTest btt = new BinTreeTest();

	    btt.start("hs_alt_HuRef_chr2.fa");

	    junit.framework.Assert.assertEquals(69798857, btt.pattern.getPatternsNumber());

        assertTrue( true );
    }
}
