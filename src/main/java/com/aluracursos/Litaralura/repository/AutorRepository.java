package com.aluracursos.Litaralura.repository;

import com.aluracursos.Litaralura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {

    // Mtodo para buscar un autor por su nombre
    Optional<Autor> findByNombreIgnoreCase(String nombre);


    @Query("SELECT a FROM Autor a WHERE a.nacimiento <= :anioIngresado AND a.fallecimiento >= :anioIngresado")
    List<Autor> encontrarAutoresPorAnio(@Param("anioIngresado") Integer anioIngresado);


//    List<Autor> autorPorFecha(Integer anoBusqueda);

    List<Autor> findAll();
}