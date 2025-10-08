// Desafio 1

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Google_Books {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello, world.");
        Scanner leitura = new Scanner(System.in);
        System.out.println("Insira o título de um livro: ");
        var busca = leitura.nextLine();

        String endereco = "https://www.googleapis.com/books/v1/volumes/?q=" + busca + "&AIzaSyDqAD5Y3TQodgtakhgBxTiU8pBtoC5BIpA";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}