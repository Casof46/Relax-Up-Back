package pe.edu.upc.demorelaxup.controllers;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demorelaxup.dtos.EjercicioRutinaDTO;
import pe.edu.upc.demorelaxup.entities.EjercicioRutina;
import pe.edu.upc.demorelaxup.serviceinterfaces.IEjercicioRutinaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ejerciciorutinas")
//@PreAuthorize("hasAuthority('ADMINISTRATOR')")
//@SecurityRequirement(name = "javasecurity")
public class EjercicioRutinaController {

    @Autowired
    private IEjercicioRutinaService eS;

    @GetMapping
    public List<EjercicioRutinaDTO> listar(){
        return eS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,EjercicioRutinaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody EjercicioRutinaDTO dto){
        ModelMapper m=new ModelMapper();
        EjercicioRutina es=m.map(dto,EjercicioRutina.class);
        eS.insert(es);
    }

    @GetMapping("/{id}")
    public EjercicioRutinaDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        EjercicioRutinaDTO dto=m.map(eS.listId(id),EjercicioRutinaDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody EjercicioRutinaDTO dto){
        ModelMapper m = new ModelMapper();
        EjercicioRutina mp=m.map(dto,EjercicioRutina.class);
        eS.update(mp);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        eS.delete(id);
    }
}
