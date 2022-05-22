package hello.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HelloworldApplication {
	
	public static  Logger log = LoggerFactory.getLogger(HelloworldApplication.class);

	public void init() {
		log.info("Spring Boot Application Started.......");

	}

	public static void main(String[] args) {
		 log.info("Application Executed .......");
		 
		SpringApplication.run(HelloworldApplication.class, args);
		
	}

}
