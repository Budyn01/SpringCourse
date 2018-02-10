package pl.budyn.bean_factory.services;

/**
 * Created by Budyn on 10.02.2018.
 */
public class PrimarySpanishGreetingService implements GreetingService {
    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreetings() {
        return greetingRepository.getSpanishGreetings();
    }
}
