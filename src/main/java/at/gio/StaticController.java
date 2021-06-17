package at.gio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.InputStream;

@Path("")
public class StaticController {

    /*
        @GET
        @Path("{path: ^static\\/.*}")
        public Response staticResources(@PathParam("path") final String path) {

            String absolutePath = format("/META-INF/resources/%s", path);
            InputStream resource = getClass().getClassLoader().getResourceAsStream(absolutePath);

            return Objects.isNull(resource)
                    ? Response.status(NOT_FOUND).build()
                    : Response.ok().entity(resource).build();
        }

        */


    //https://stackoverflow.com/questions/8642920/how-to-serve-static-content-with-jax-rs/8643120#8643120
        @GET
        @Produces(MediaType.TEXT_HTML)
        public InputStream getMessage() throws Exception{
            //String absolutePath = "/resources/MaintenanceMode.html";
            InputStream resource =getClass().getClassLoader().getResourceAsStream("MaintenanceMode.html");
            System.out.println(resource);
            return resource;
        }
}
