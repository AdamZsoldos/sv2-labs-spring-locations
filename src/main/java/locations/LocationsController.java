package locations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

@RestController
public class LocationsController {

    private final LocationsService locationsService;

    public LocationsController(LocationsService locationsService) {
        this.locationsService = locationsService;
    }

    @GetMapping("/locations")
    @ResponseBody
    public String getLocations() {
        return locationsService.getLocations().stream()
                .map(Location::toString)
                .collect(Collectors.joining("<br />"))
                + "<br />" + LocalDateTime.now();
    }
}
