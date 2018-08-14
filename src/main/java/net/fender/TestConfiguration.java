package net.fender;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@Configuration
@EnableConfigurationProperties(ServiceProperties.class)
public class TestConfiguration {

    @Bean
    @Profile("!prod")
    public Service service(ServiceProperties props, Environment env) {
        return new NotProdService(env.getActiveProfiles()[0]);
    }

    @Bean
    @Profile("prod")
    public Service service(ServiceProperties props) {
        return new ProdService(props);
    }

}
