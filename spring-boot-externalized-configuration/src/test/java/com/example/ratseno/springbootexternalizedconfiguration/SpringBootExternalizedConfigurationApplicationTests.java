package com.example.ratseno.springbootexternalizedconfiguration;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.*;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = "ratseno.name=test")
public class SpringBootExternalizedConfigurationApplicationTests {

	@Autowired
	Environment environment;

	//test/resources/application.properties 파일이 있을경우
	//main/resources/application.properties 파일을 엎어쓴다.
	@Test
	public void contextLoads() {
		assertThat(environment.getProperty("ratseno.name"))
				.isEqualTo("test");
	}

}
