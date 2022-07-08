public class Car implements Vehicle {

    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        engine.setIsON(true);
        System.out.println("Jadę samochodem");
    }

    @Override
    public void stop() {
        engine.setIsON(false);
        System.out.println("Zatrzymuję samochód");
    }

}