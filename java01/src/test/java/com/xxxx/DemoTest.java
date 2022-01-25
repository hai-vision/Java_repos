package com.xxxx;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author hai
 * @date 2022/1/25
 * version 1.0
 */
@SuppressWarnings({"all"})
public class DemoTest {
    @Test
    public void testDemo () {
        Demo demo = new Demo();
        String s = demo.say("maven");
        //System.out.println(s);
        Assert.assertEquals("hello maven", s);
    }
}
