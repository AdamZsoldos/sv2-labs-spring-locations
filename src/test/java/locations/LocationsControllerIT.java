package locations;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class LocationsControllerIT {

    @Autowired
    LocationsController locationsController;

    @Test
    void testGetLocations() {
        assertThat(locationsController.getLocations())
                .startsWith("Location{id=null, name='Home', lat=20.0, lon=40.0}<br />");
    }
}
