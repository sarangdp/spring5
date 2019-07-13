package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{

    @Override
    public String sayGreetings() {
        return "I am Constructor Greeting Service Impl";
    }
}
