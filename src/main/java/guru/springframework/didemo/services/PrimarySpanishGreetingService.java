package guru.springframework.didemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class PrimarySpanishGreetingService implements GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public String sayGreetings() {
        return greetingRepository.getSpanishGreeting();
    }
}