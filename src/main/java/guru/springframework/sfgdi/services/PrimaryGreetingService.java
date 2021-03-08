package guru.springframework.sfgdi.services;

//@Primary
//@Service //to use external java class configuration
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY Bean";
    }
}
