package de.hfriedri.demo;

import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
class SpringJenkinsApplicationTests {

    @Test
    void contextLoads() {
        assertThat(true, is(true));
    }
}