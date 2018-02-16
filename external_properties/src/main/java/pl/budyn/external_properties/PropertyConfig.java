package pl.budyn.external_properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created by Budyn on 12.02.2018.
 */
@Configuration
@PropertySource("classpath:user.properties")
//@PropertySources({
//        @PropertySource("classpath:application.properties"),
//        @PropertySource("classpath:user.properties")
//})
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${myUser.name}")
    String name;
    @Value("${myUser.password}")
    String password;
    @Value("${myUser.city}")
    String city;

    @Bean
    public User user() {
        User user = new User();
        user.setCity(city);
        user.setName(env.getProperty("USER_NAME"));
        user.setPassword(password);
        return user;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
