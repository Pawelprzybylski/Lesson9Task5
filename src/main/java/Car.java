public class Car implements Vehicle {
    public Car(Engine engine) {
        engine.setIsON(engine.isOn());
    }

    @Override
    public void drive() {
        System.out.println("Jadę samochodem");
    }

    @Override
    public void stop() {
        System.out.println("Zatrzymuję samochód");
    }

}