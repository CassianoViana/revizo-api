package br.com.viana;

import br.com.viana.database.Database;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/revizo")
public class RevizoResource {

    @Inject
    private Database database;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }

    @Path("/save")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void save(String content){
        database.save(content);
    }

    @Path("/list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String list(){
        return database.list();
    }

}