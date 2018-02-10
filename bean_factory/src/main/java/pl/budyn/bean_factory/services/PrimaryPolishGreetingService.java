package pl.budyn.bean_factory.services;

/**
 * Created by Budyn on 10.02.2018.
 */
public class PrimaryPolishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryPolishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreetings() {
        return greetingRepository.getPolishGreetings();
    }
}
