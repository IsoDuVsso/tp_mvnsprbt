 package fr.iut.ic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(oApplication.class, args);
	}
}

@Component
class MainRunner implements CommandLineRunner{

	@Autowired A a ;
	@Autowired B b ;
	@Override
	public void run(String... args) throws Exception {
	
	System.out.println(b.foo());
	}
	
}

class C{
	
}

@Configuration
class Config{
	 @Bean
	 public C bean() {
		C c = new C();		
		 return c;
	 }
}
