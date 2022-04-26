package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Racing {

    private Cars cars ;
    private Random random =new Random();
    private int maxPosition=0;
    private List<String> winners =new ArrayList<>();

    public Racing(String names) {
        cars = new Cars(names);
    }

    public void playGame(){
        for(Car car: cars.getCars()){
            race(car);
            System.out.println(car.StringPosition());
        }
    }

    private void race(Car car){
        if(makeRandom()>=4){
            car.move();
            setMaxPosition(car);
        }
    }

    private void setMaxPosition(Car car){
        if(car.getPosition()>maxPosition)
        maxPosition =car.getPosition();
    }

    private int makeRandom(){
        return random.nextInt(10);
    }

    public List<String> pickWinner(){
        ArrayList<String> winners=new ArrayList<>();
        for(Car car : cars.getCars())
        if(car.getPosition()==maxPosition){
            winners.add(car.getName());
        }
        return winners;
    }
}
