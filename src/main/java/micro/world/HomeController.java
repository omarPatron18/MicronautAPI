package micro.world;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.validation.Validated;
import io.reactivex.Single;

@Controller("/home")
public class HomeController {

    @Get("/")
    public String home() {
        return "Hello AMX TEAM";
    }
}