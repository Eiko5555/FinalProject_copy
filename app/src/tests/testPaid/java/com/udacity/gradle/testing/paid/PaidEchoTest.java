package com.udacity.gradle.testing.paid;

import org.junit.Test;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

public class PaidEchoTest{
    @Test
    public void verifyEchoResponse(){
        Collection<String> strings =
                PaidEcho.echo("Hello", 10);
        assertEquals(strings.size(), 10);
        for (String string : strings){
            assertEquals(string, "Hello");
        }
    }
}