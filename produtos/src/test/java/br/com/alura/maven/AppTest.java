package br.com.alura.maven;

import junit.framework.Test;
import junit.framework.TestCase; 
import junit.framework.TestSuite;

/**
*Unit test for simple Apps
*/
public class AppTest extends TestCase
{
    /**
    *Create the test case
    *
    * @param testName name of the test case
    * /
    public AppTest( String testName )
    { 
        super( testName );
    }

    /**
    * @return the suit of tests being tested
    */
    public static Test suite()
    {
        return new TestSuite(AppTest.class );
    }

    /**
    * Rugourous Test :-)
    */
    public void testApp()
    {
        assertTrue( true );
    }
}