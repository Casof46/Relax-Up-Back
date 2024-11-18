package pe.edu.upc.demorelaxup.controllers;


import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demorelaxup.dtos.CantidadForosByUsuariosDTO;
import pe.edu.upc.demorelaxup.dtos.CantidadTecnicasRelajacionByRutinaDTO;
import pe.edu.upc.demorelaxup.dtos.TecnicasRelajacionDTO;
import pe.edu.upc.demorelaxup.entities.TecnicasRelajacion;
import pe.edu.upc.demorelaxup.serviceinterfaces.ITecnicasRelajacionService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tecnicasrelajacion")
//@PreAuthorize("hasAuthority('ADMINISTRATOR')")
//@SecurityRequirement(name = "javasecurity")
public class TecnicasRelajacionController {

    @Autowired
    private ITecnicasRelajacionService tR;

    @GetMapping
    public List<TecnicasRelajacionDTO> listar(){
        return tR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TecnicasRelajacionDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody TecnicasRelajacionDTO dto){
        ModelMapper m=new ModelMapper();
        TecnicasRelajacion er=m.map(dto,TecnicasRelajacion.class);
        tR.insert(er);
    }

    @GetMapping("/{id}")
    public TecnicasRelajacionDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        TecnicasRelajacionDTO dto=m.map(tR.listId(id),TecnicasRelajacionDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody TecnicasRelajacionDTO dto){
        ModelMapper m = new ModelMapper();
        TecnicasRelajacion mp=m.map(dto,TecnicasRelajacion.class);
        tR.update(mp);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        tR.delete(id);
    }


    @GetMapping("/cantidadTecnicas")
    public List<CantidadTecnicasRelajacionByRutinaDTO> ObtenerCantidadTecnicas(){
        List<String[ ]>lista=tR.CantidadTecnicas();
        List<CantidadTecnicasRelajacionByRutinaDTO>listaDTO=new ArrayList<>();
        for(String[ ] columna:lista){
            CantidadTecnicasRelajacionByRutinaDTO dto=new CantidadTecnicasRelajacionByRutinaDTO();
            dto.setNombre_tecnicas(columna[0]);
            dto.setCantidad_rutinas(Integer.parseInt(columna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}