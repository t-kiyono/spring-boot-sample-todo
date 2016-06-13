package net.be_geek.spring_boot_sample_todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class App {

	public static void main( String[] args ) {
		SpringApplication.run(App.class, args);
	}

}
