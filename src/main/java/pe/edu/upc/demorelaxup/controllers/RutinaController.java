package pe.edu.upc.demorelaxup.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demorelaxup.dtos.CantidadTecnicasRelajacionByRutinaDTO;
import pe.edu.upc.demorelaxup.dtos.RutinaDTO;
import pe.edu.upc.demorelaxup.entities.Rutina;
import pe.edu.upc.demorelaxup.serviceinterfaces.IRutinaService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rutina")
//@PreAuthorize("hasAuthority('ADMINISTRATOR')")
//@SecurityRequirement(name = "javasecurity")
public class RutinaController {

    @Autowired
    private IRutinaService rS;

    @GetMapping
    public List<RutinaDTO> listar(){
        return rS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,RutinaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody RutinaDTO dto){
        ModelMapper m=new ModelMapper();
        Rutina er=m.map(dto,Rutina.class);
        rS.insert(er);
    }

    @GetMapping("/{id}")
    public RutinaDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        RutinaDTO dto=m.map(rS.listId(id),RutinaDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody RutinaDTO dto){
        ModelMapper m = new ModelMapper();
        Rutina mp=m.map(dto,Rutina.class);
        rS.update(mp);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        rS.delete(id);
    }


    @GetMapping("/cantidadRutinas")
    public List<CantidadTecnicasRelajacionByRutinaDTO> ObtenerCantidadRutinas(){
        List<String[ ]>lista=rS.CantidadRutinas();
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