package pe.edu.upc.demorelaxup.controllers;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demorelaxup.dtos.CantidadConfirmaronDTO;
import pe.edu.upc.demorelaxup.dtos.EventosDTO;
import pe.edu.upc.demorelaxup.entities.Eventos;
import pe.edu.upc.demorelaxup.serviceinterfaces.IEventosService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/eventos")
//@PreAuthorize("hasAuthority('ADMINISTRATOR')")
//@SecurityRequirement(name = "javasecurity")
public class EventosController {
    @Autowired
    private IEventosService eS;
    @GetMapping
    public List<EventosDTO> listar(){
        return eS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, EventosDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody EventosDTO dto){
        ModelMapper m = new ModelMapper();
        Eventos e = m.map(dto, Eventos.class);
        eS.insert(e);
    }
    @GetMapping("/{id}")
    public EventosDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        EventosDTO dto = m.map(eS.listId(id), EventosDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody EventosDTO dto){
        ModelMapper m = new ModelMapper();
        Eventos e = m.map(dto, Eventos.class);
        eS.update(e);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ eS.delete(id);}

    @GetMapping("/Confirmaron")
    public List<CantidadConfirmaronDTO> ObtenerCantidadConfirmaron() {
        List<String[ ]>lista=eS.confirmaron();
        List<CantidadConfirmaronDTO>listaDTO=new ArrayList<>();
        for (String[] columna:lista){
            CantidadConfirmaronDTO dto=new CantidadConfirmaronDTO();
            dto.setIdeventoC(Integer.parseInt(columna[0]));
            dto.setTitulo(columna[1]);
            dto.setCantidad_confirmado(Integer.parseInt(columna[2]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
