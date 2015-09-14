package com.aeromexico.example.moduleb;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.log4j.Logger;

/**
 *
 * @author Ivan Villa
 */

public class ExampleModulebTest
    extends TestCase
{
  	final static Logger logger = Logger.getLogger(ExampleModulebTest.class);

    public ExampleModulebTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( ExampleModulebTest.class );
    }

    public void testApp()
    {
      logger.debug("++++++ Testing AeroMexico Module B Example...");
    	String user = "Ramon";
      ExampleModuleB example = new ExampleModuleB();
      assertTrue( example.whoAreYou(user) );

    }
}
