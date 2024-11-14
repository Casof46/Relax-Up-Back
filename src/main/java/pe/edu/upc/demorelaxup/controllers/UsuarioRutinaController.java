package pe.edu.upc.demorelaxup.controllers;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demorelaxup.dtos.ProgresoCompletadoDTO;
import pe.edu.upc.demorelaxup.dtos.UsuarioRutinaDTO;
import pe.edu.upc.demorelaxup.entities.UsuarioRutina;
import pe.edu.upc.demorelaxup.serviceinterfaces.IUsuarioRutinaService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/UsuarioRutina")
//@PreAuthorize("hasAuthority('ADMINISTRATOR')")
//@SecurityRequirement(name = "javasecurity")
public class UsuarioRutinaController {
    @Autowired
    private IUsuarioRutinaService Uu;
    @GetMapping
    public List<UsuarioRutinaDTO> listar() {
        return Uu.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioRutinaDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody UsuarioRutinaDTO dto) {
        ModelMapper m = new ModelMapper();
        UsuarioRutina u = m.map(dto, UsuarioRutina.class);
        Uu.insert(u);
    }
    @GetMapping("/{id}")
    public UsuarioRutinaDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        UsuarioRutinaDTO dto = m.map(Uu.listId(id), UsuarioRutinaDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody UsuarioRutinaDTO dto) {
        ModelMapper m = new ModelMapper();
        UsuarioRutina u = m.map(dto, UsuarioRutina.class);
        Uu.update(u);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {Uu.delete(id);}

    @GetMapping("/Progresocompletado")
    public List<ProgresoCompletadoDTO> progresoCompletado() {
        List<String[ ]>lista=Uu.progresocompleto();
        List<ProgresoCompletadoDTO>listaDTO=new ArrayList<>();
        for (String[] columna:lista){
            ProgresoCompletadoDTO dto=new ProgresoCompletadoDTO();
            dto.setIdusuario(Integer.parseInt(columna[0]));
            dto.setNombreusuario(columna[1]);
            dto.setProgreso(Integer.parseInt(columna[2]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
