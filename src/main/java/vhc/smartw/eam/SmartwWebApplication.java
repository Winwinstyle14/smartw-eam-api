package vhc.smartw.eam;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Api",version = "1.0",description = "Quan ly Api"))
public class SmartwWebApplication {
//http://localhost:8080/swagger-ui.html
	public static void main(String[] args) {
		SpringApplication.run(SmartwWebApplication.class, args);
	}

}
