package com.springboot.administrador.repository;


import com.springboot.commons.usuarios.entity.AdministradorEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path="administrador")
public interface AdministradorRepository  extends PagingAndSortingRepository<AdministradorEntity, Integer> {

    @RestResource(path="buscar-username")
    AdministradorEntity findByUsername(@Param("username") String username);
}
