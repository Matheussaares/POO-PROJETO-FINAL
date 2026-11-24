package br.com.oficinabike.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI oficinaBikeOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("API da Oficina de Bicicletas")
                        .description("API REST para gerenciar clientes, bicicletas, mecânicos, peças, serviços e ordens de serviço de uma oficina de bicicletas.")
                        .version("1.0.0"));
    }
}
