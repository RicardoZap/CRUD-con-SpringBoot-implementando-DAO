package com.rzapata.springboot.di.app.spring_boot_data_jpa.models.service;

import java.util.List;

import com.rzapata.springboot.di.app.spring_boot_data_jpa.models.entity.Cliente;

public interface IClienteService {
    
    public List<Cliente> findAll();

    public void save(Cliente cliente);

    public Cliente findOne(Long id);

    public void delete(Long id);
}
