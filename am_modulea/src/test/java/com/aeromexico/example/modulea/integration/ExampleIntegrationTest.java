package com.aeromexico.example.modulea.integration;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.log4j.Logger;
import com.aeromexico.example.moduleb.*;
import com.aeromexico.example.modulea.*;

/**
 *
 * @author Ivan Villa
 */

public class ExampleIntegrationTest
    extends TestCase
{
  	final static Logger logger = Logger.getLogger(ExampleIntegrationTest.class);

    public ExampleIntegrationTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( ExampleIntegrationTest.class );
    }

    public void testApp()
    {
      logger.debug("++++++ Integration Test AeroMexico Module A Example...");

      String usera = "Aldo_";
      ExampleModuleA examplea = new ExampleModuleA();
      assertTrue( examplea.whoAreYou(usera) );

      String userb = "Ramon_";
      ExampleModuleB exampleb = new ExampleModuleB();
      assertTrue( exampleb.whoAreYou(userb) );

    }
}
