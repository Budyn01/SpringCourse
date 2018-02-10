package pl.budyn.bean_factory.services;

import org.springframework.stereotype.Component;

/**
 * Created by Budyn on 10.02.2018.
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreetings() {
        return "Hello from England!";
    }

    @Override
    public String getPolishGreetings() {
        return "Hello from Poland!";
    }

    @Override
    public String getSpanishGreetings() {
        return "Hello from Spain!";
    }
}
