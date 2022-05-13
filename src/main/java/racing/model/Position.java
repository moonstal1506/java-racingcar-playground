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

    public String getStringPosition(){
        String StringPosition ="";
        for(int i=0;i<position;i++){
            StringPosition+="-";
        }
        return StringPosition;
    }
}
