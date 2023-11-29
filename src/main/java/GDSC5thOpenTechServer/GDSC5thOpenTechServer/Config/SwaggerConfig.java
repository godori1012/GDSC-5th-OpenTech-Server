package GDSC5thOpenTechServer.GDSC5thOpenTechServer.Config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    private Info apiInfo() {
        return new Info()
                .title("GDSC Open Tech Seminar Api Docs")
                .version("0.0.1")
                .description("GDSC Open Tech Seminar의 백엔드 세션용 Api 문서입니다");
    }

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(apiInfo());
    }

}