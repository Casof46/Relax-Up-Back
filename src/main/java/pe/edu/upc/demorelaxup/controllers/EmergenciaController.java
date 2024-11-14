package pe.edu.upc.demorelaxup.controllers;


import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demorelaxup.dtos.CantidadEmergenciasByUsuariosDTO;
import pe.edu.upc.demorelaxup.dtos.EmergenciaDTO;
import pe.edu.upc.demorelaxup.dtos.EmergenciasByDiaDTO;
import pe.edu.upc.demorelaxup.entities.Emergencia;
import pe.edu.upc.demorelaxup.serviceinterfaces.IEmergenciaService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/emergencias")
//@PreAuthorize("hasAuthority('ADMINISTRATOR')")
//@SecurityRequirement(name = "javasecurity")
public class EmergenciaController {

    @Autowired
    private IEmergenciaService eS;

    @GetMapping
    public List<EmergenciaDTO> listar(){
        return eS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,EmergenciaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody EmergenciaDTO dto){
        ModelMapper m=new ModelMapper();
        Emergencia er=m.map(dto,Emergencia.class);
        eS.insert(er);
    }

    @GetMapping("/{id}")
    public EmergenciaDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        EmergenciaDTO dto=m.map(eS.listId(id),EmergenciaDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody EmergenciaDTO dto){
        ModelMapper m = new ModelMapper();
        Emergencia mp=m.map(dto,Emergencia.class);
        eS.update(mp);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        eS.delete(id);
    }

    @GetMapping("/emergenciasDia")
    public List<EmergenciasByDiaDTO> totalEmergencias() {
        List<String[]> lista = eS.totalEmergencias();
        List<EmergenciasByDiaDTO> listaDTO = new ArrayList<>();
        for (String[] columna : lista) {
            EmergenciasByDiaDTO dto = new EmergenciasByDiaDTO();
            dto.setFecha(LocalDate.parse(columna[0]));
            dto.setTotalEmergencias(Integer.parseInt(columna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

    @GetMapping("/cantidadEmergencias")
    public List<CantidadEmergenciasByUsuariosDTO> ObtenerCantidadEmergencias(){
        List<String[ ]>lista=eS.EmergenciaByUsuario();
        List<CantidadEmergenciasByUsuariosDTO>listaDTO=new ArrayList<>();
        for(String[ ] columna:lista){
            CantidadEmergenciasByUsuariosDTO dto=new CantidadEmergenciasByUsuariosDTO();
            dto.setNombreUser(columna[0]);
            dto.setQuantityEmergencias(Integer.parseInt(columna[1]));
            listaDTO.add(dto);

        }
        return listaDTO;
    }
}
