package kawah.edu;

import org.w3c.dom.stylesheets.LinkStyle;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 *  JPA TYPE QUERY & NATIVE QUERY
 */

@Path("task")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TaskResource {
    @Inject
    EntityManager em;

    @GET
    public List<Task> listTaks(){
        return em.createQuery("SELET t FROM Task t",Task.class).getResultList();
    }

    @GET
    @Path("{id}")
    public Task getTaskById(@PathParam("id") long id){
        Task task =  em.createQuery("SELECT t FROM Task t WHERE id = :id",Task.class).setParameter("id",id).getSingleResult();
        return task;
    }

    @GET
    @Path("native")
    public List<Task> taskList(){
        return  em.createNativeQuery("SELECT * FROM task",Task.class).getResultList();
    }

    @GET
    @Path("native/{id}")
    public Object getTaskBy(@PathParam("id") long id){
        Object result =  em.createNativeQuery("SELECT * FROM task WHERE id = :id",Task.class).setParameter("id",id).getSingleResult();
        return result;
    }



}
