package racing;

import java.util.Random;

public class Racing {

    private Cars cars ;
    private Random random =new Random();

    public Racing(String names) {
        cars = new Cars(names);
    }

    public void game(){
        for(Car car: cars.getCars()){
            race(car);
        }
    }

    private void race(Car car){
        if(makeRandom()>=4){
            car.move();
        }
    }

    private int makeRandom(){
        return random.nextInt(10);
    }
}
