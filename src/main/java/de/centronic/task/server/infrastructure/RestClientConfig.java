package de.centronic.task.server.infrastructure;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestClientConfig {
    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getInterceptors().add(new AuthorizationInterceptor("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"));
        return restTemplate;
    }
}
