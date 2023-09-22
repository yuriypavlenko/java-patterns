package patterns.structural.facade;

public class EngineFacade {
    private final FuelInjector fuelInjector;
    private final Electrisity electrisity;
    private final Starter starter;

    EngineFacade() {
        fuelInjector = new FuelInjector();
        electrisity = new Electrisity();
        starter = new Starter();
    }

    public void engineStart() {
        electrisity.on();
        fuelInjector.injectFuel();
        starter.on();
        starter.waitForStart();
    }
}
