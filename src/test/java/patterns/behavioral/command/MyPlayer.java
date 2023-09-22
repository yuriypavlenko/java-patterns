package patterns.behavioral.command;

public class MyPlayer implements Player {
    @Override
    public void play() {
        System.out.println("Im playing...");
    }

    @Override
    public void pause() {
        System.out.println("Im on pause");
    }

    @Override
    public void stop() {
        System.out.println("Im stopped");
    }
}
