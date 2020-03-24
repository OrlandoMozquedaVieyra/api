package com.mycompany.UsuarioDAO;

import com.mycompany.Modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    public static List<Usuario> getUsuario(){
        List<Usuario> lista = new ArrayList();
        Usuario obj = new Usuario("Juan","Juan1","1234","juan@live.com");
        lista.add(obj);
        return lista;
    }
}
