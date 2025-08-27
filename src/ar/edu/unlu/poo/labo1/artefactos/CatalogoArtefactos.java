package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {
    Set<Artefacto> inventario = new HashSet<>();

    public void agregarArtefacto (Artefacto artefacto){
        inventario.add(artefacto);
        System.out.println("Artefacto: " + artefacto);
    }
    public Set obtenerArtefactosUnicos (){
        return inventario;
    }

    public List<Artefacto> buscarArtefactosPorTipo(String amuleto) {
        List <Artefacto> artefactosTipo = new ArrayList<>();
        for (Artefacto artefacto : inventario){
            // Pendiente
        }

    }

    public Map<String, Integer> contarArtefactosPorTipo() {
        Map <String, Integer> artefactos = new HashMap<>();
        return artefactos;
    }

    public Artefacto obtenerArtefactoMasPoderoso() {
        return null;
    }

}
