package org.acme;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("home")
public class HomeResource {

    @GET
    public String home(){
        return "ini adalah home";
    }

}
