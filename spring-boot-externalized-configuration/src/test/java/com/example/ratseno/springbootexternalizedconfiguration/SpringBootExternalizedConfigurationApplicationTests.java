package com.example.ratseno.springbootexternalizedconfiguration;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.*;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootExternalizedConfigurationApplicationTests {

	@Autowired
	Environment environment;

	@Test
	public void contextLoads() {
		assertThat(environment.getProperty("ratseno.name"))
				.isEqualTo("onestar");
	}

}
