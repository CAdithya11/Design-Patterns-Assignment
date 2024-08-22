package Task1;

public class RemoteControl {
    private Command[] commandSetOne; // Handles Light On Commands
    private Command[] commandSetTwo; // Handles Light Off Commands
    private Command undo;
    public RemoteControl(int slots) {
        this.commandSetOne = new Command[slots]; // Set Value to the commandSetOne as an array
        this.commandSetTwo =  new Command[slots]; // Set Value to the commandSetTwo as an array
    }

    public void setCommand(int slot,Command lightOn,Command lightOff){
        commandSetOne[slot] = lightOn; // Slot 0 , 1  light On
        commandSetTwo[slot] = lightOff; // Slot 0 , 1 Light Off
    }
    public void onButtonWasPressed(int slot){
        commandSetOne[slot].execute();
        // One Slot 0 => KitchenRoomLightOn
        // One Slot 1 => LivingRoomLightOn
        undo = commandSetTwo[slot];
        // Store the opposite to the undo
    }

    public void offButtonWasPressed(int slot){
        commandSetTwo[slot].execute();
        // Two Slot 0 => KitchenRoomLightOFF
        // Two Slot 1 => LivingRoomLightOFF
        undo = commandSetOne[slot];
    }
    public void undoButtonWasPressed(){
        // execute the button that stored
        undo.execute();
    }
}

