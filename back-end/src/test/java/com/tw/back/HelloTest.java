package com.tw.back;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by taozhang on 2/16/15.
 */
public class HelloTest {
    @Autowired
    private Hello hello;

    @Test
    public void should_return_hello_world_when_called_hello_say() {
        String content = hello.sayHello();

        assertThat(content, is("Hello world!"));
    }
}
