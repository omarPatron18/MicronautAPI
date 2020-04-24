package micro.world;

import javax.inject.Inject;
 
import org.json.simple.JSONObject;
import io.micronaut.http.HttpResponse;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Produces;
import io.micronaut.validation.Validated;
import io.reactivex.Single;


@Controller("/persons")
public class PersonController {

@Inject
 PersonService personService;

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }



@Post("/person")
 public HttpStatus addPerson(@Body Person person) {
 personService.addPerson(person);
 return HttpStatus.CREATED;
 }
 
 @SuppressWarnings("unchecked")
 @Produces(MediaType.APPLICATION_JSON)
 @Get("/person")
 public JSONObject getPersons() {
 JSONObject responseObj = new JSONObject();
 responseObj.put("data",personService.getAllPersons());
 return responseObj;
 }

 @Put("/person")
 public HttpStatus updatePerson(@Body Person person) {
 personService.updatePerson(person);
 return HttpStatus.CREATED;
 }

  @Delete("/person/{id}")
 public HttpStatus deletePerson(Integer id) {
 personService.deletePerson(id);
 return HttpStatus.CREATED;
 }

  @Get("/person/{id}")
 public JSONObject getPerson(Integer id) {
 JSONObject responseObj = new JSONObject();
 responseObj.put("data",personService.getPerson(id));
 return responseObj;
 }


}