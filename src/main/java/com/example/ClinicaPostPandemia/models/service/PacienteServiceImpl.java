package com.example.ClinicaPostPandemia.models.service;

import com.example.ClinicaPostPandemia.models.dto.Paciente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService{

    public List<Paciente> listaPacientes;

    public PacienteServiceImpl(){
        listaPacientes = new ArrayList<>();
        listaPacientes.add(new Paciente("12.345.678-9", "Juanito Perez", 34, "Fonasa"));
        listaPacientes.add(new Paciente("11.222.333-4", "Beto Velez", 66, "Fonasa"));
        listaPacientes.add(new Paciente("25.987.654-3", "Lalo Landa", 18, "Isapre"));
        listaPacientes.add(new Paciente("18.343.434-8", "Juan Carlos Bodoque", 40, "Fonasa"));
        listaPacientes.add(new Paciente("19.999.999-9", "Tulio Triviño", 48, "Isapre"));
    }

    public PacienteServiceImpl(List<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    @Override
    public List<Paciente> findAll() {
        return listaPacientes;
    }

    @Override
    public Paciente findOne(String rut) {
        return null;
    }

    @Override
    public boolean create(Paciente p) {
        return false;
    }

    @Override
    public boolean update(Paciente p) {
        return false;
    }

    @Override
    public boolean delete(String rut) {
        return false;
    }
}
