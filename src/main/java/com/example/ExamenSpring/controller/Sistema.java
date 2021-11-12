package com.example.ExamenSpring.controller;


import com.example.ExamenSpring.entity.*;
import com.example.ExamenSpring.service.SystemService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Sistema {


@Autowired
private SystemService systemService;


    // Para procesar las solicitudes de obtención,
    @GetMapping("/{dni}")
    public List<Cliente> getCliente()
    {
        return systemService.getCliente();
    }

    //
    //Es para mandar  la direecion al postman Para procesar las solicitudes de obtención,
    @PostMapping("/agregarCli")
    public void addCliente(@RequestBody Cliente cliente)
    {
        systemService.addCliente(cliente);
    }



   /* public Cliente buscarCliente(String dni)
    {
        return clientes.stream().filter(cliente -> cliente.getDni().equalsIgnoreCase(dni)).findFirst().get();

    }*/

    //@DeleteMapping, maneja la solicitud de eliminación
    @DeleteMapping("/deleteCliente/{dni}")
    public void deleteCliente(@PathVariable ("dni") String dni)
    {

    systemService.deleteCliente(dni);
    }

    //@PutMapping, maneja la solicitud de colocación
    @PutMapping
    public void updateCliente(@RequestBody Cliente cliente)
    {
        systemService.updateCLiente(cliente);
    }



    //Metodos de Item

    @PostMapping("/addLibro")
    public void addIteamLibro(@RequestBody Libro libro){
        systemService.addLibro(libro);
    }
    @PostMapping("/addCd")
    public void addIteamCD(@RequestBody Cd cd){
        systemService.addCd(cd);
    }
    @GetMapping("/Item")
    public List<ItemPrestamo> getItems(){
        return systemService.getItems();
    }

}
