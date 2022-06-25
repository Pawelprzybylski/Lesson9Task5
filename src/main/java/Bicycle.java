public class Bicycle implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Jadę rowerem");
    }

    @Override
    public void stop() {
        System.out.println("Zatrzymuję się rowerem");
    }

}
