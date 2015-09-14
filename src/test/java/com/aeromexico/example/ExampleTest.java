package com.aeromexico.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.log4j.Logger;

/**
 *
 * @author Ivan Villa
 */

public class ExampleTest
    extends TestCase
{
  	final static Logger logger = Logger.getLogger(ExampleTest.class);

    public ExampleTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( ExampleTest.class );
    }

    public void testApp()
    {
      logger.debug("++++++ Testing AeroMexico Parent Example...");
    	String user = "Ivan";
      Example example = new Example();
      assertTrue( example.whoAreYou(user) );

    }
}
