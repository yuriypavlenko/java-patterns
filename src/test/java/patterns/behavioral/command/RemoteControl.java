package patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private final Command playCommand;
    private final Command pauseCommand;
    private final Command stopCommand;

    private final List<Command> commandHistory;

    RemoteControl(Command play, Command pause, Command stop) {
        this.playCommand = play;
        this.pauseCommand = pause;
        this.stopCommand = stop;

        commandHistory = new ArrayList<>();
    }

    public void play() {
        playCommand.execute();
        commandHistory.add(playCommand);
    }

    public void pause() {
        pauseCommand.execute();
        commandHistory.add(pauseCommand);
    }

    public void stop() {
        stopCommand.execute();
        commandHistory.add(stopCommand);
    }

    public void prev() {
        if(commandHistory.size() >= 2) {
            commandHistory.remove(commandHistory.size() - 1); // удаляем текущую исполняемую команду
            Command commandFromHistory = commandHistory.get(commandHistory.size() - 1); // получаем предыдущую команду
            commandFromHistory.execute();
        }
    }
}
