package patterns.behavioral.command;

public class StopCommand implements Command {
    protected Player player;

    StopCommand(Player player) {
        this.player = player;
    }
    @Override
    public void execute() {
        player.stop();
    }
}
