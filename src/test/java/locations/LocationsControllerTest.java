package locations;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class LocationsControllerTest {

    @Mock
    LocationsService locationsService;

    @InjectMocks
    LocationsController locationsController;

    @Test
    void testGetLocations() {
        when(locationsService.getLocations())
                .thenReturn(List.of(new Location("Home", 20, 40)));
        assertThat(locationsController.getLocations())
                .startsWith("Location{id=null, name='Home', lat=20.0, lon=40.0}<br />");
    }
}
