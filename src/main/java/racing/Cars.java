package racing;

import java.util.ArrayList;

public class Cars {

    private ArrayList<Car> cars= new ArrayList<>();

    public Cars(String names) {
        createCar(names);
    }

    private void createCar(String names){
        for(String name: splitName(names)){
            cars.add(new Car(new Name(name)));
        }
    }

    private String[] splitName(String names){
        return names.split(",");
    }

    public ArrayList<Car> getCars(){
        return cars;
    }
}
