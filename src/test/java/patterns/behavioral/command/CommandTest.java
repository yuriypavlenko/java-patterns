package patterns.behavioral.command;

import org.junit.jupiter.api.Test;

public class CommandTest {

    @Test
    public void test() {
        Player player = new MyPlayer();

        PlayCommand playCommand = new PlayCommand(player);
        PauseCommand pauseCommand = new PauseCommand(player);
        StopCommand stopCommand = new StopCommand(player);

        RemoteControl remoteControl = new RemoteControl(playCommand, pauseCommand, stopCommand);
        remoteControl.play();
        remoteControl.pause();
        remoteControl.prev();
        remoteControl.stop();
    }
}
