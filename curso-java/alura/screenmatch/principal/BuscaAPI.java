package alura.screenmatch.principal;

import alura.screenmatch.modelos.Titulo;
import alura.screenmatch.modelos.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class BuscaAPI {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual filme deseja buscar?");
        String buscaFilme = scanner.next();

        String enderecoAPI = "http://www.omdbapi.com/?t=" + buscaFilme + "&apikey=285f0454";

        // Cria um cliente HTTP capaz de enviar solicitações e receber respostas de servidores da web.
        HttpClient client = HttpClient.newHttpClient();

        // Declaração da requisição HTTP
        // O newBuilder() cria um construtor para uma nova requisição HTTP, permitindo configurar os detalhes da requisição.    // O URI especificado é o endpoint da API do ViaCEP para obter informações sobre o CEP 01001000 (um exemplo fictício).    // O método build() finaliza a construção da requisição e retorna uma instância de HttpRequest, pronta para ser enviada.
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(enderecoAPI))
                .build();

        // Responsável por obter a resposta da API
        // O método client.send() envia a requisição ao servidor e espera pelo retorno da API, tratando a resposta como uma string.
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // O método response.body() retorna o corpo da resposta da API como uma string.
        // System.out.println(response.body());


        // Instanciar Gson
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        // Aqui, response.body contem uma representação em forma de String de um objeto JSON
        String json = response.body();
        // Aqui, converte a string json em um objeto do tipo Titulo. O fromJson é o método da classe que realiza a conversão
        //Titulo meuTitulo = gson.fromJson(json, Titulo.class);

        TituloOMDB titulo = gson.fromJson(json, TituloOMDB.class);
        System.out.println(titulo);

    }

}
