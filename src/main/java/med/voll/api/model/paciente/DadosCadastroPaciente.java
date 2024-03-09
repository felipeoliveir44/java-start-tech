package med.voll.api.model.paciente;

import med.voll.api.endereco.DadosEndereco;

import javax.xml.stream.events.EndElement;

public record DadosCadastroPaciente(String nome, String email, String telefone, String cpf, DadosEndereco endereco) {
    @Override
    public String toString() {
        return "Dados do paciente: \n" +
                "Nome: " + nome + "\n" +
                "Email:" + email + "\n" +
                "Telefone: " + telefone + "\n" +
                "CPF: " + cpf + "\n" +
                "Endereço: " + endereco + "\n" +
                "----------------- \n";

    }
}

