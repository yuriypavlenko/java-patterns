package patterns.behavioral.command;

public class PlayCommand implements Command {
    protected Player player;

    PlayCommand(Player player) {
        this.player = player;
    }
    @Override
    public void execute() {
        player.play();
    }
}
