package com.xml.analyzer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class AppTest {

    @Test
    public void applicationContextLoaded() {
    }

    @Test
    public void applicationContextTest() {
        App.main(new String[]{});
    }
}