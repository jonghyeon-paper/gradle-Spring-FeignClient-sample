package hello;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignIntroductionApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(FeignIntroductionApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// something to do
	}
}