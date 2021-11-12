package com.example.ExamenSpring.service;


import com.example.ExamenSpring.entity.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SystemService {

    private List<Prestamo> pretsmos;
    private List<Cliente> clientes = new ArrayList<>();
    private  List<ItemPrestamo> item = new ArrayList<>();


    public void addCliente(Cliente cliente)
    {
        clientes.add(cliente);
    }

    public void addItems(ItemPrestamo itemPrestamo)
    {
        item.add(itemPrestamo);
    }




    public List<Cliente> getCliente()
    {
        return clientes;
    }

    public Cliente buscarCliente(String dni)
    {
        return clientes.stream().filter(cliente -> cliente.getDni().equalsIgnoreCase(dni)).findFirst().get();

    }

    public void deleteCliente(String dni)
    {
        Optional<Cliente> optionalCliente = Optional.ofNullable(buscarCliente(dni));
        if (optionalCliente.isPresent()){
            clientes.remove(optionalCliente.get());
        }

    }


    public  void updateCLiente(Cliente cliente)
    {
        deleteCliente(cliente.getDni());
        clientes.add(cliente);
    }

// Agregar Items

    public void addLibro(Libro libro){
        item.add(libro);
    }
    public void addCd(Cd cd){
        item.add(cd);
    }
    public List<ItemPrestamo> getItems(){
        return item;
    }
}
