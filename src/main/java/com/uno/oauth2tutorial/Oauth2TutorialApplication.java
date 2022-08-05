package com.uno.oauth2tutorial;

import com.uno.oauth2tutorial.config.properties.AppProperties;
import com.uno.oauth2tutorial.config.properties.CorsProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		CorsProperties.class,
		AppProperties.class
})
public class Oauth2TutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2TutorialApplication.class, args);
	}

}
