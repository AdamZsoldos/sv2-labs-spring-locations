package locations;

import java.util.List;

public class LocationsService {

    private final List<Location> locations = List.of(
            new Location("Home", 20, 40),
            new Location("Work", 30, 40)
    );

    public List<Location> getLocations() {
        return locations;
    }
}
