import java.util.ArrayList;
import java.util.List;

public class Population {

    int pop_size = 100;
    List<Thief> thievesPopulation = new ArrayList<>();

    void initialise(List<City> listOfCities) {
        for (int i = 0; i < pop_size; i++) {
            thievesPopulation.add(new Thief(listOfCities));
        }
    }

}
