package locations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.junit.jupiter.api.Assertions.*;

class LocationsServiceTest {

    @Test
    void testGetLocations() {
        assertThat(new LocationsService().getLocations())
                .extracting(Location::getName, Location::getLat, Location::getLon)
                .containsExactly(
                        tuple("Home", 20d, 40d),
                        tuple("Work", 30d, 40d)
                );
    }
}
