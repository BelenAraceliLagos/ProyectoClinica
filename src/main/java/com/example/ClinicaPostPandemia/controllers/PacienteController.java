package com.example.ClinicaPostPandemia.controllers;

import com.example.ClinicaPostPandemia.ClinicaPostPandemiaApplication;
import com.example.ClinicaPostPandemia.models.dto.Paciente;
import com.example.ClinicaPostPandemia.models.service.PacienteServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pacientes")
public class PacienteController {

    private static final Logger logger = LoggerFactory.getLogger(ClinicaPostPandemiaApplication.class);
    PacienteServiceImpl service;

    public PacienteController(PacienteServiceImpl service) {
        this.service = service;
    }

    public String findAll(Model model){
        logger.info("Iniciando findAll()");
        model.addAttribute("pacientes", service.findAll());
        return "pacientes";
    }

    @GetMapping("{rut}")
    public String findOne(@PathVariable("rut") String rut, Model model){
        model.addAttribute("paciente", service.findOne(rut));
        return "editar";
    }

    @GetMapping("/nuevo")
    public String newPaciente(){
        return "nuevo";
    }

    @PostMapping("/nuevo")
    public String createPaciente(@ModelAttribute Paciente paciente){
        boolean result = service.create(paciente);

        return "redirect:/paciente";
    }
}
