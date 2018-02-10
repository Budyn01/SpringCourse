package pl.budyn.bean_factory.services;

/**
 * Created by Budyn on 10.02.2018.
 */
public class GreetingServiceFactory {

    private GreetingRepository greetingsRepository;

    public GreetingServiceFactory(GreetingRepository greetingsRepository) {
        this.greetingsRepository = greetingsRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "en":
                return new PrimaryGreetingService(greetingsRepository);
            case "pl":
                return new PrimaryPolishGreetingService(greetingsRepository);
            case "es":
                return new PrimarySpanishGreetingService(greetingsRepository);
            default:
                return new PrimaryGreetingService(greetingsRepository);
        }
    }
}
