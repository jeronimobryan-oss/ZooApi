package com.zooapi.repositorio;

import com.zooapi.model.Habitat;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**Capa donde se guardan los datos
o en su defecto mandarlos a la base de datos */
@Service
public class HabitatRepositorio {
    private int habitatid= 1;
    List<Habitat> habitats=new ArrayList<>();
    public HabitatRepositorio() {
    }
    public Habitat guardarHabitad(Habitat habitat) {
        habitats.add(habitat);
        habitat.setHabitatid(habitatid);
        habitatid++;
        return habitat;

    }
}
