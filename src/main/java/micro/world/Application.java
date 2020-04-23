package micro.world;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
        info = @Info(
                title = "API Saludo",
                version = "1.0",
                description = "My Primer API Micronaut",
                license = @License(name = "Apache 2.0", url = "http://omarpatron18.github.io"),
                contact = @Contact(url = "http://omarpatron18.github.io", name = "OmarPatron", email = "irvingomar1819@gmail.com")
        )
)

public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }
}