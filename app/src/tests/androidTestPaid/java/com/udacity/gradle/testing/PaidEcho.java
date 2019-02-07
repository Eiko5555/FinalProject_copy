package com.udacity.gradle.testing;

import android.support.test.runner.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class PaidEchoAndroidTest{
    @Test
    public void testVerifyEchoResponse(){
        assertEquals("Hello", Echo.echo("Hello"));
    }
    @Test
    public void testVerifyLoggingEchoResponse() {
        Collection<String> strings = PaidEcho.echo(
                "Hello", 10, true);
        assertEquals(string.size(), 10);
        for (String string : strings){
            assertEquals(string, "Hello");
        }
        assertEquals("Hello", Echo.echo("Hello", true));
    }
}