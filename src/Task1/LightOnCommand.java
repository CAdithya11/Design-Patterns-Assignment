package Task1;

public class LightOnCommand implements Command{
    private Light RoomLight;
    public LightOnCommand(Light RoomLight) {
        this.RoomLight = RoomLight;
    }

    @Override
    public void execute() {
        RoomLight.on(); // Handles both Rooms lights on command
    }

    @Override
    public void undo() {
        RoomLight.off(); // Do the opposite of the execute command by handling the opposite method of Room Light On (Execute)
    }
}
