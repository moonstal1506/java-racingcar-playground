package racingGame;

import java.util.Random;

public class Racing {



    public int makeRandomNumber() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public boolean isMoveable(Car car,int randomNumber){
        if(randomNumber>4){
            car.move();
        }
        return false;
    }

    public void printPosition(Car car){
        for(int i=0;i<car.getPosition();i++){
            System.out.print("-");
        }
        System.out.println();
    }




}
