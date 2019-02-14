package com.curso.spring.concesionario.core.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.spring.concesionario.core.entidades.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {

}
