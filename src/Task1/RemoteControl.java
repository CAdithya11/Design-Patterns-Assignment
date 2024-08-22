package Task1;

public class RemoteControl {
    private Command[] commandSetOne;
    private Command[] commandSetTwo;
    private Command undo;
    public RemoteControl(int slots) {
        this.commandSetOne = new Command[slots];
        this.commandSetTwo =  new Command[slots];
    }

    public void setCommand(int slot,Command lightOn,Command lightOff){
        commandSetOne[slot] = lightOn;
        commandSetTwo[slot] = lightOff;
    }
    public void onButtonWasPressed(int slot){
        commandSetOne[slot].execute();
        undo = commandSetTwo[slot];
    }

    public void offButtonWasPressed(int slot){
        commandSetTwo[slot].execute();
        undo = commandSetOne[slot];
    }
    public void undoButtonWasPressed(){
        undo.execute();
    }
}

