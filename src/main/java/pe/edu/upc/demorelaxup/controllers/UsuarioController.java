package pe.edu.upc.demorelaxup.controllers;


import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demorelaxup.dtos.CantidadForosByUsuariosDTO;
import pe.edu.upc.demorelaxup.dtos.CantidadForosByUsuariosDTO;
import pe.edu.upc.demorelaxup.dtos.RolDTO;
import pe.edu.upc.demorelaxup.dtos.UsuarioDTO;
import pe.edu.upc.demorelaxup.entities.Rol;
import pe.edu.upc.demorelaxup.entities.Usuario;
import pe.edu.upc.demorelaxup.serviceinterfaces.IUsuarioService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;

    @GetMapping
    public List<UsuarioDTO> listar(){

        return uS.list().stream().map(x->{
            ModelMapper m  = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody UsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        Usuario ur=m.map(dto,Usuario.class);
        uS.insert(ur);
    }

    @GetMapping("/{id}")
    public UsuarioDTO listarID(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        UsuarioDTO dto=m.map(uS.listId(id),UsuarioDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody UsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        Usuario mp=m.map(dto,Usuario.class);
        uS.update(mp);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        uS.delete(id);
    }

}
