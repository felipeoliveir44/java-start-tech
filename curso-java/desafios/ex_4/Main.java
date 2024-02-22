package desafios.ex_4;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String json = "{\"nome\":\"João\",\"idade\":30,\"cidade\":\"São Paulo\"}";

        System.out.println(json);

        Pessoa pessoa = gson.fromJson(json, Pessoa.class);

        System.out.println(pessoa.toString());

        Pessoa pessoa1 = new Pessoa("José", 35, "Belo Horizonte");

        // Utilizando Gson para converter o objeto Pessoa em JSON
        String json1 = gson.toJson(pessoa);

        // Exibindo o JSON resultante
        System.out.println("JSON: " + json1);

    }
}
