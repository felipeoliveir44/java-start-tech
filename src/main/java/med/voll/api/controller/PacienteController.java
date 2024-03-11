package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.model.paciente.DadosCadastroPaciente;
import med.voll.api.model.paciente.DadosListagemPaciente;
import med.voll.api.model.paciente.Paciente;
import med.voll.api.model.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping("/cadastrar")
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados) {

        repository.save(new Paciente(dados));
    }

    @GetMapping("/listar")
    public List<DadosListagemPaciente> listarPacientes() {
        return repository.findAll().stream().map(DadosListagemPaciente::new).toList();
    }



}
