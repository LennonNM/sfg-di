package guru.springframework.sfgdi.services;

//@Service // To use external config -> Java class config
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
