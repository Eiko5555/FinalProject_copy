package com.udacity.gradle.testing;

import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class EchoAndroidTest extends AndroidTestCase{
    @Test
    public void testVerifyEchoResponse(){
        assertEquals("Hello", Echo.echo("Hello"));
    }
    @Test
    public void testVerifyLoggingEchoResponse(){
        assertEquals("Hello", Echo.echo("Hello", true));
    }
}