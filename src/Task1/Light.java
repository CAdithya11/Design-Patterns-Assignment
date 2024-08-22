package Task1;

public interface Light {
    public void on();
    public void off();
    public void dim(int level); // Stored to give the availability of undo button
}
