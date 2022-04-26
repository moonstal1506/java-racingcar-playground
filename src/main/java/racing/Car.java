package racing;

public class Car {

    private Name name;
    private int position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = 0;
    }

    public void move() {
        position++;
    }

    public String StringPosition() {
        String StringPosition ="";
        for (int i = 0; i < position; i++) {
            StringPosition+="-";
        }
        return name.getName() + ": "+StringPosition;
    }

    public int getPosition(){
        return position;
    }

    public String getName(){
        return name.getName();
    }
}
