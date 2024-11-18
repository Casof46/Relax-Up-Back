package pe.edu.upc.demorelaxup.controllers;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demorelaxup.dtos.CantidadForosByUsuariosDTO;
import pe.edu.upc.demorelaxup.dtos.CantidadMensajesForosDTO;
import pe.edu.upc.demorelaxup.dtos.ForosDTO;
import pe.edu.upc.demorelaxup.entities.Foros;
import pe.edu.upc.demorelaxup.serviceinterfaces.IForosService;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/foross")
//@PreAuthorize("hasAuthority('ADMINISTRATOR')")
//@SecurityRequirement(name = "javasecurity")
public class ForosController {

    @Autowired
    private IForosService fS;

    @GetMapping
    public List<ForosDTO> listar(){

        return fS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return  m.map(x,ForosDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody ForosDTO dto){
        ModelMapper m=new ModelMapper();
        Foros mp=m.map(dto,Foros.class);
        fS.insert(mp);
    }

    @GetMapping("/{id}")
    public ForosDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        ForosDTO dto=m.map(fS.listId(id),ForosDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody ForosDTO dto){
        ModelMapper m=new ModelMapper();
        Foros mp=m.map(dto,Foros.class);
        fS.update(mp);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        fS.delete(id);}



    @GetMapping("/CantidadMensajes")
    public List<CantidadMensajesForosDTO> ObtenerCantidadMensajes() {
        List<String[ ]>lista=fS.CantidadMensajesForos();
        List<CantidadMensajesForosDTO>listaDTO=new ArrayList<>();
        for (String[] columna:lista){
            CantidadMensajesForosDTO dto=new CantidadMensajesForosDTO();
            dto.setNameForo(columna[0]);
            dto.setNameUser(columna[1]);
            dto.setCantidadMensajesForos(Integer.parseInt(columna[2]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
    @GetMapping("/cantidadForos")
    public List<CantidadForosByUsuariosDTO> ObtenerCantidadForos(){
        List<String[ ]>lista=fS.CamtidadForos();
        List<CantidadForosByUsuariosDTO>listaDTO=new ArrayList<>();
        for(String[ ] columna:lista){
            CantidadForosByUsuariosDTO dto=new CantidadForosByUsuariosDTO();
            dto.setNombre_usuario(columna[0]);
            dto.setCantidad_foros(Integer.parseInt(columna[1]));
            listaDTO.add(dto);

        }
        return listaDTO;
}
}
