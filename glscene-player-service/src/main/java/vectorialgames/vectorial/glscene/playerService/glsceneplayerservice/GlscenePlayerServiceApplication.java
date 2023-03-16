package vectorialgames.vectorial.glscene.playerService.glsceneplayerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GlscenePlayerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GlscenePlayerServiceApplication.class, args);
	}

}
