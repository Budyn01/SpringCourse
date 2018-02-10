package pl.budyn.bean_factory.services;

/**
 * Created by Budyn on 10.02.2018.
 */
public class PrimaryGreetingService implements GreetingService {

    private GreetingRepository greetingsRepository;

    public PrimaryGreetingService(GreetingRepository greetingsRepository) {
        this.greetingsRepository = greetingsRepository;
    }

    @Override
    public String sayGreetings() {
        return greetingsRepository.getEnglishGreetings();
    }
}
