package patterns.behavioral.command;

public class PauseCommand implements Command {
    protected Player player;

    PauseCommand(Player player) {
        this.player = player;
    }
    @Override
    public void execute() {
        player.pause();
    }
}
