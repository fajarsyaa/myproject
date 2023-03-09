package org.acme;

import io.vertx.core.json.JsonObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject hello() {
        JsonObject response = new JsonObject();
        response.put("message","Hello from RESTEasy Reactive");
        return response;
    }
}