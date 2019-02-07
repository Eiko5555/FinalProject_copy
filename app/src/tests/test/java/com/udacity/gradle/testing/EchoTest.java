package com.udacity.gradle.testing;

import org.junit.Test;

public class EchoTest{
    @Test
    public void verifyEchoResponse(){
        assert Echo.echo("Hello").equals("Hello");
    }
}