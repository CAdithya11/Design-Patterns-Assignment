package Task1;

public class LightOnCommand implements Command{
    private Light RoomLight;
    public LightOnCommand(Light RoomLight) {
        this.RoomLight = RoomLight;
    }

    @Override
    public void execute() {
        RoomLight.on();
    }

    @Override
    public void undo() {
        RoomLight.off();
    }
}
