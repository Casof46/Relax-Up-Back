package pe.edu.upc.demorelaxup.controllers;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demorelaxup.dtos.SuscripcionesDTO;
import pe.edu.upc.demorelaxup.entities.Suscripciones;
import pe.edu.upc.demorelaxup.serviceinterfaces.ISuscripcionesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/suscripciones")
//@PreAuthorize("hasAuthority('ADMINISTRATOR')")
//@SecurityRequirement(name = "javasecurity")
public class SuscripcionesController {

    @Autowired
    private ISuscripcionesService sS;

    @GetMapping
    public List<SuscripcionesDTO> listar(){

        return sS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return  m.map(x,SuscripcionesDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody SuscripcionesDTO dto){
        ModelMapper m=new ModelMapper();
        Suscripciones ci=m.map(dto,Suscripciones.class);
        sS.insert(ci);
    }
    @GetMapping("/{id}")
    public SuscripcionesDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        SuscripcionesDTO dto=m.map(sS.listId(id),SuscripcionesDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody SuscripcionesDTO dto){
        ModelMapper m = new ModelMapper();
        Suscripciones mp=m.map(dto,Suscripciones.class);
        sS.update(mp);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id) {sS.delete(id);}
}
