package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    final static public String HELLO_GURUS = "Hello Gurus!!! Original";
    @Override
    public String sayGreetings() {
        return GreetingServiceImpl.HELLO_GURUS;
    }
}
