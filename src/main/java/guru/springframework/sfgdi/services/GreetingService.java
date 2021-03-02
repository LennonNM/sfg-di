package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service // Spring needs to know this is a Servico to be able to inject properties
public interface GreetingService {

    String sayGreeting();
}
