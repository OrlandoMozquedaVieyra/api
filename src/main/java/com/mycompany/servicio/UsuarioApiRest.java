package com.mycompany.servicio;

import com.mycompany.Modelo.Usuario;
import com.mycompany.UsuarioDAO.UsuarioDAO;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("usuario")
public class UsuarioApiRest {
    
    private static List<Usuario> lista = UsuarioDAO.getUsuario();
    
    //Consulta
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsuario(){
        return Response.ok(lista).build();
    }
    
    //Envio de datos
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response guardarUsuario(Usuario usuario){
        lista.add(usuario);
        return Response.status(Response.Status.CREATED).entity(usuario).build();
    }
}
