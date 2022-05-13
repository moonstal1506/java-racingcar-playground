package racing.model;

public class Position {

    private int position;

    public Position() {
        this.position = 0;
    }

    public int getPosition() {
        return position;
    }

    public int move(){
        return ++position;
    }
}
