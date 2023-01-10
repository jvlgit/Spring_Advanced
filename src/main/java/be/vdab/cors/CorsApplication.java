package be.vdab.cors;


import io.swagger.v3.oas.models.OpenAPI;
import org.springdoc.webmvc.api.OpenApiActuatorResource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import io.swagger.v3.oas.models.info.Info;

@SpringBootApplication
public class CorsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CorsApplication.class, args);
    }

    @Bean
    OpenAPI openAPI() {
        return new OpenAPI().info(new Info().title("Rekenen").version("1.0.0")
                .description("Berekeningen maken"));
    }
}
