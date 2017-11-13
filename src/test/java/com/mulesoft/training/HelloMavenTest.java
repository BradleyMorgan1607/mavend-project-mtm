package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

    @Test
    public void mavenFlowReturnsHelloWorld() throws Exception {
        runFlowAndExpect("mavenFlow", "Hello World");
    }
    
    @Override
    protected String getConfigFile() {
        return "mavend-project.xml";
    }

}
