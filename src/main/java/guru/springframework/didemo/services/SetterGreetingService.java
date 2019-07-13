package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{

    @Override
    public String sayGreetings() {
        return "I am Setter Greeting Service Impl";
    }
}
