package kawah.edu;

import javax.ws.rs.*;
import java.util.List;


@Path("person")
public class PersonResource {
    @GET
    public List<Person> list(){
        return Person.listAll();
    }


}
