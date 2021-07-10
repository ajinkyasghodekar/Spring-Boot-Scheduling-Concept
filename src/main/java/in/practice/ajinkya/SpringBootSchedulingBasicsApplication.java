package in.practice.ajinkya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootSchedulingBasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSchedulingBasicsApplication.class, args);
	}

}
