package de.hfriedri.demo;

/*-
 * #%L
 * Project: hfriedri-demo
 * File: SpringJenkinsApplicationTests.java
 * %%
 * Copyright (C) 2021 Hfriedri
 * %%
 * Header of my_license
 * #L%
 */

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
class HfriedriDemoApplicationTest {

	@Test
	void contextLoads() {
		assertThat(true, is(true));
	}
}
