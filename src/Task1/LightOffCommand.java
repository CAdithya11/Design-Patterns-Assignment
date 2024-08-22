package Task1;

public class LightOffCommand implements Command{
    private Light roomLight;
    public LightOffCommand(Light roomLight) {
        this.roomLight = roomLight;
    }

    @Override
    public void execute() {
        roomLight.off();
    }

    @Override
    public void undo() {
        roomLight.on();
    }
}
