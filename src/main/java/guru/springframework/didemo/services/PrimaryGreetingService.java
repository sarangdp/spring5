package guru.springframework.didemo.services;

public class PrimaryGreetingService implements GreetingService {

   private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreetings() {
        return greetingRepository.getEnglishGreeting();
    }
}
