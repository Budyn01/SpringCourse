package pl.budyn.bean_factory.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import pl.budyn.bean_factory.services.GreetingRepository;
import pl.budyn.bean_factory.services.GreetingService;
import pl.budyn.bean_factory.services.GreetingServiceFactory;

/**
 * Created by Budyn on 10.02.2018.
 */
@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingsServiceFactory(GreetingRepository greetingRepository) {
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"default", "en"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("es")
    GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("es");
    }

    @Bean
    @Primary
    @Profile("pl")
    GreetingService primaryPolishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("pl");
    }

}
