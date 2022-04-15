package racingGame;

import java.util.Objects;

public class Car {
    private final String name;
    public static int maxPosition=0;
    private int position=0;

    Car(String name)  {
        if(name.length()>5){
            throw new IllegalArgumentException();
        }
        this.name=name;
    }

    public void move(){
        position++;
        setMaxPosition();
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void setMaxPosition(){
        if(maxPosition< this.position){
            maxPosition=this.position;
        }
    }

}
