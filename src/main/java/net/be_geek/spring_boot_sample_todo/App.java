package net.be_geek.spring_boot_sample_todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(basePackageClasses = {App.class, Jsr310JpaConverters.class})
public class App {

	public static void main( String[] args ) {
		SpringApplication.run(App.class, args);
	}

}
