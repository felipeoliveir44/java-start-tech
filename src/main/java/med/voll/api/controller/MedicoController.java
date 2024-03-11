package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.model.medico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @Autowired
    private MedicoRepository repository;

    // Se chegar uma requisição post, faça esse método
    @PostMapping("/cadastrar")
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedicos dados) {
        repository.save(new Medico(dados));
    }

    @GetMapping("/listar")
    public Page<DadosListagemMedicos> listarClientes(@PageableDefault(size = 10, sort = {"id"}) Pageable paginacao) {
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemMedicos::new);
    }

    @PutMapping("/atualizar")
    @Transactional
    public void atualizar(@RequestBody DadosAtualizacaoMedicos dados) {
        var medico = repository.getReferenceById(dados.id());

        medico.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){

        var medico = repository.getReferenceById(id);
        medico.excluir();
    }
}
