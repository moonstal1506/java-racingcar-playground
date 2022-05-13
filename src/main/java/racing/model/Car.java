package racing.model;

import java.util.Objects;

public class Car {

    private static final String COLON = " : ";
    private Name name;
    private Position position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position();
    }

    public int move(){
       return position.move();
    }

    public String status(){
        return name.getName()+COLON+position.getStringPosition();
    }
}
