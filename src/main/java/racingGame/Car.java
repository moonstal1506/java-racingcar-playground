package racingGame;

import java.util.Objects;

public class Car {

    private final String name;

    public Car(String name) throws IllegalAccessException {
        if(name.length()>5){
            throw new IllegalAccessException("자동차 이름은 5자를 초과할 수 없습니다.");
        }
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
