/**
 * Swagger API
 * http://localhost:8080/swagger-ui/index.html
 */

package dio.web.api.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.OpenAPI;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Title - Rest API")
                        .version("1.0")
                        .description("API exemplo de uso de Springboot REST API")
                        .termsOfService("Termo de uso: Open Source")
                        .license(new io.swagger.v3.oas.models.info.License().name("Licença - Sua Empresa").url("http://www.seusite.com.br"))
                        .contact(new Contact().name("Seu nome").url("http://www.seusite.com.br").email("voce@seusite.com.br")));
    }
}
