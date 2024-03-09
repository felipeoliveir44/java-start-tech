package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.model.medico.DadosCadastroMedicos;
import med.voll.api.model.medico.Medico;
import med.voll.api.model.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class MedicoController {
    @Autowired
    private MedicoRepository repository;

    // Se chegar uma requisição post, faça esse método
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedicos dados) {

        repository.save(new Medico(dados));
    }
}
