package org.acme;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Path("books")
public class BookResource {
    List<String> books = new ArrayList<>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getBooks(){
        return books;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> addBooks(String data){
        books.add(data);
        return Collections.singletonList(data);
    }

    @PUT
    @Path("{index}")
    public String getBook(Integer index){
        return books.get(index);
    }

    @DELETE
    @Path("{index}")
    public String deleteBook(Integer index){
        books.remove(index);
        return "success hapus";
    }

}
