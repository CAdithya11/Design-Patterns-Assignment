package Task1;

public class LightDimCommand implements Command{
    private Light light;
    private int Brightness = 0;

    public LightDimCommand(Light light,int newBrightness) {
        this.light = light;
        this.Brightness = this.Brightness + newBrightness;
    }

    @Override
    public void execute() {
        light.dim(Brightness);
    }

    @Override
    public void undo() {
        Brightness = Brightness + Brightness;
        if(Brightness<= 100){
            light.dim(Brightness);
        }
    }
}
