package at.gio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/maintenanceMode")
public class MessageController {

    public static String message = "-";

    @GET
    @Path("/write/{message}")
    @Produces(MediaType.TEXT_PLAIN)
    public String setMessage(@PathParam("message") String message){
        if (message.equals(""))
            return "Error, expected message";
        MessageController.message = message;
        return "OK";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage(){
        return MessageController.message;
    }

    @GET
    @Path("/Reset")
    @Produces(MediaType.TEXT_PLAIN)
    public String reset() {
        MessageController.message = "-";
        return "Message reset";
    }
}
