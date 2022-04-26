package racing;

public class Car {

    private Name name;
    private int position;

    public Car(Name name) {
        this.name = name;
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
}
