package org.nocoder.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceSpaceTest {
    @Test
    public void replaceSpace() {
        ReplaceSpace replaceSpace = new ReplaceSpace();
        StringBuffer str = new StringBuffer("We Are Happy");
        assertEquals("We%20Are%20Happy", replaceSpace.replaceSpace(str));
    }
}
