package guru.springframework.sfgdi.services;

//@Service // to use external config -> Java class config
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
