package com.rzapata.springboot.di.app.spring_boot_data_jpa.models.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.rzapata.springboot.di.app.spring_boot_data_jpa.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

    
}
