package utility;

public class Cell {
    private final int x;
    private final int y;
    private int state;

    public Cell(int x, int y, int state) {
        this.x = x;
        this.y = y;
        this.state = state;
    }

    public boolean isOff(){
        return state == 0;
    }

    public boolean isOn(){
        return state == 1;
    }

    public void turnOff(){
        state = 0;
    }

    public void turnOn(){
        state = 1;
    }



}
