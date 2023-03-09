package kawah.edu;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

/**
 *  HIBERNATE
 */
@Path("weather")
public class CuacaResource {
    @GET
    public List<Cuaca> list(){
        return Cuaca.listAll();
    }


}
