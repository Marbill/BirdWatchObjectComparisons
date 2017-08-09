
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/* @author marbi */
public class RingingCentre {

    private Map<Bird, List<String>> places;

    public RingingCentre() {
        places = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        if (!this.places.containsKey(bird)) {
            this.places.put(bird, new ArrayList<String>());
        }

        this.places.get(bird).add(place);
    }

    public void observations(Bird bird) {
        int counter = 0;

        for (Bird b : this.places.keySet()) {
            if (b.equals(bird)) {
                counter = this.places.get(b).size();
            }
        }
        
        System.out.println(bird +  " observations: " + counter);
        if (this.places.containsKey(bird)) {
            for (String place : this.places.get(bird)) {
                System.out.println(place);
            }
        }
    }
}
