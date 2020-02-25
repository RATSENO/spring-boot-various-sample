package com.example.ratseno.springbootexternalizedconfiguration;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.*;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations = "classpath:/test.properties")
public class SpringBootExternalizedConfigurationApplicationTests {

	@Autowired
	Environment environment;

	@Test
	public void contextLoads() {

		///test.properties의 우선순위가 높기때문에
		//application.properties의 name을 덮어쓴다.
		assertThat(environment.getProperty("ratseno.name"))
				.isEqualTo("testName");
	}

	@Test
	public void contextLoads2() {

		//main/resources/application.properties 파일과
		//test/resources/test.properties파일의 이름이 다르기 때문에
		//오버라이드 되지않고 두 설정파일이 존재한다
		assertThat(environment.getProperty("ratseno.height"))
				.isEqualTo("191");
	}

}
