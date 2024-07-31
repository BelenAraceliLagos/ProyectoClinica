package com.example.ClinicaPostPandemia.models.service;

import com.example.ClinicaPostPandemia.models.dto.Paciente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PacienteService {

    List<Paciente> findAll();
    Paciente findOne(String rut);
    boolean create(Paciente p);
    boolean update(Paciente p);
    boolean delete(String rut);
}
