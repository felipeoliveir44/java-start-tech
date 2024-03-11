package med.voll.api.model.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;
import org.flywaydb.core.internal.util.ClassUtils;

import javax.xml.stream.events.EndElement;

public record DadosCadastroPaciente(
        @NotBlank
        String nome,
        @Email
                @NotBlank
        String email,
        @NotBlank
        String telefone,
        @NotBlank
        @Pattern(regexp = "\\d{11}")
        String cpf,
        @NotNull
        @Valid
        DadosEndereco endereco) {
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

