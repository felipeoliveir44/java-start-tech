package med.voll.api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        @NotBlank
        String logradouro,
        @NotBlank
        String bairro,
        @NotBlank
                @Pattern(regexp = "\\d{8}")
        String cep,
        @NotBlank
        String cidade,
        @NotBlank
        String uf,
        String complemento,
        String numero) {

    @Override
    public String toString() {
        return
                "\n Logradouro: " + logradouro + "\n" +
                "Bairro: " + bairro + "\n" +
                "cep: " + cep + "\n" +
                "cidade: " + cidade + "\n" +
                "UF: " + uf + "\n" +
                "Complemento: " + complemento + "\n" +
                 "Número:" + numero + "\n";

    }

}
