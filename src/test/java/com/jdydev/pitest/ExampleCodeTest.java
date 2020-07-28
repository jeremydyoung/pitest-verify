package com.jdydev.pitest;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ExampleCodeTest {

    @Test
    public void testShouldDoFoo() {
        ExampleCode ec = new ExampleCode();
        assertTrue(ec.shouldDoFoo("foo"));
        assertFalse(ec.shouldDoFoo(null));
    }
}
